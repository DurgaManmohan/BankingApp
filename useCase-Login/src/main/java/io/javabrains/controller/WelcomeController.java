package io.javabrains.controller;


import java.sql.Date;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.RequestContextHolder;

import io.javabrains.entity.AuthRequest;
import io.javabrains.entity.User;
import io.javabrains.entity.Session;
import io.javabrains.repository.LoginRepository;

import io.javabrains.util.JwtUtil;


@RestController
public class WelcomeController {
	
	private AuthenticationManager authenticationmanager;
	private String p;
	
	
	
	@Autowired
    private JwtUtil jwtUtil;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@Autowired
	private LoginRepository repository;
	
	 @Autowired
	 private AuthenticationManager authenticationManager;
	
	@GetMapping("/authentication")
	public List<Object> getDetails() {
		String url= "http://localhost:8080/logins";
		Object[] objects= restTemplate.getForObject(url, Object[].class);
		return Arrays.asList(objects);
		
	}
	
	@PostMapping("/authenticate")
    public Session generateToken(@RequestBody AuthRequest authRequest) throws Exception {
        try {
        	Authentication auth = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword())
            );
        	p=RequestContextHolder.currentRequestAttributes().getSessionId();
        	System.out.println("Here");
        	
        	User user=repository.findByUserName(authRequest.getUserName());
        	user.setCustomer_Session_Id(p);
        	System.out.println(user.getCustomer_Session_Id());
        	repository.save(user);
        	return new Session("Valid",user.getUserName(),user.getCustomer_type(),
        			user.getLast_login_date(),user.getCustomer_Session_Id());
          
        } catch (Exception ex) {
        	ex.printStackTrace();
        	return new Session("Invalid",null,null,null,null);
        }
    }
	
	@RequestMapping(method=RequestMethod.DELETE, value="/bank/user/authenticate")
	public void updateStatus(@RequestBody Session session) {
		     if( session.getSessionid().equals(session)) {
		    	  session.setLoginstatus("Invalid");
		     }
		     else {
		    	 session.setLoginstatus("Valid");
		     }
	}
	
	@GetMapping("/test")
	public String getSomething() {
		return "test";
	}
	
}
