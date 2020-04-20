package com.usecase.logintable;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	@Autowired
	LoginRepository loginrepository;
	
	public List<Login>  getAllLogins()
	{
		List<Login> logins = new ArrayList<Login>();
		loginrepository.findAll().forEach(login -> logins.add(login));
		return logins;
	}
	
	public Login getLoginByUserId(String userid) {
		return loginrepository.findById(userid).get();
	}
	
	public void saveOrUpdate(Login login) {
		loginrepository.save(login);
    }
	
	 public void delete(String userid) {
		 loginrepository.deleteById(userid);
	    }

}
