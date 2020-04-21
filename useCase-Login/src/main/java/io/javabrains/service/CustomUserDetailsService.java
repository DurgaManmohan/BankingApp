package io.javabrains.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import io.javabrains.entity.User;
import io.javabrains.repository.LoginRepository;

@Service
public class CustomUserDetailsService {
	
	
	@Autowired
	private LoginRepository repository;
//	@Override
//	public	UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
//		User user=repository.findByUserName(username);
//		
//		return new org.springframework.security.core.userdetails.User(user.getUserName(),user.getPassword(), new ArrayList<>());
//	}
//	
//	
//	@Bean
//	public PasswordEncoder passwordEncoder()
//	{
//		return NoOpPasswordEncoder.getInstance();
//		
//	}

}
	