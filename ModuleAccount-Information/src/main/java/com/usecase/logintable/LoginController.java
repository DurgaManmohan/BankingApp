package com.usecase.logintable;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@GetMapping("/logins")
    private List<Login> getAllLogins() {
        return loginService.getAllLogins();
    }

    @GetMapping("/logins/{userid}")
    private Login getLogin(@PathVariable("userid") String userid) {
        return loginService.getLoginByUserId(userid);
    }

    @DeleteMapping("/logins/{userid}")
    private void deleteLogin(@PathVariable("userid") String userid) {
        loginService.delete(userid);
    }

    @PostMapping("/logins")
    private String saveLogin(@RequestBody Login login) {
        loginService.saveOrUpdate(login);
        return login.getUserid();
    }
	

	
	
}
