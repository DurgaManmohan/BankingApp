package io.usecase.accounts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.RequestContextHolder;


import io.usecase.Accounts;
import io.usecase.Person;
import io.usecase.Rewards;
import io.usecase.Sessionstatus;
import io.usecase.Status;
import io.usecase.Trans;
import io.usecase.Transcation;
import io.usecase.User;

//import io.usecase.User;

@RestController
class AccountsController {
	
	
  // Aggregate root

  @GetMapping("/employees")
  List<String> all() {
    return Arrays.asList("sds","sfdsf");
  }
  
  @PostMapping("/bank/user/dashboard/accountInfo")
  public Person getById(@RequestBody Accounts accounts){
	  
	  RestTemplate restTemplate=new RestTemplate();
	  Sessionstatus req=restTemplate.postForObject("http://localhost:9192/authentication",new Status(accounts.getSessionid()),Sessionstatus.class);
	  System.out.println(accounts.getUserid());
	  if(req.getSessionstatus().equals("Valid")){
	  //User req=restTemplate.getForObject("http://localhost:9192/authenticate" + accounts.getSessionid(), User.class);
	 
	 
	  Person person=restTemplate.getForObject("http://localhost:8080/persons/" + accounts.getUserid(), Person.class);
	 
	  System.out.println(person);
	  return person;
	  }
	  else {
		  return null;
	  }
  }

	  
      	
  
      
	  
  
  @PostMapping("/bank/user/dashboard/transcations")
  public Transcation getByAccountId(@RequestBody Trans trans){
	  
	  RestTemplate restTemplate=new RestTemplate();
	  Sessionstatus req=restTemplate.postForObject("http://localhost:9192/authentication",new Status(trans.getSessionid()),Sessionstatus.class);
	  System.out.println(trans.getAccountNumber());
	  if(req.getSessionstatus().equals("Valid")){
		  Transcation transcation=restTemplate.getForObject("http://localhost:8080/transcations/" + trans.getAccountNumber(), Transcation.class);
		  System.out.println(transcation);
	  return transcation;
	  }
	  else {
		  return null;
	  }
  }
  @GetMapping("/bank/user/rewards/{userid}")
  public Rewards getByRewardsId(@PathVariable String userid){
	  
	  RestTemplate restTemplate=new RestTemplate();
	  System.out.println(userid);
	  Rewards rewards=restTemplate.getForObject("http://localhost:8080/rewards/" + userid, Rewards.class);
	  System.out.println(rewards);
	  return rewards;
  }
 
}
