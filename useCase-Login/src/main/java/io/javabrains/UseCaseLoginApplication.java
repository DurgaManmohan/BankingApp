package io.javabrains;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import io.javabrains.entity.User;
import io.javabrains.repository.LoginRepository;

@SpringBootApplication
@EnableEurekaClient
public class UseCaseLoginApplication {
	
	@Autowired
	private LoginRepository repository;
	
	@Bean
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
	
   @PostConstruct
	public void initUsers() {
		List<User> users = 	Stream.of(
				new User(101,"rahul","know","user1@gmail.com","c457041f-a7a1-4370-9e24-3dbc9ccb6126","tier-1","inactive","2/2/2020"),
				new User(102,"vikram","password","user2@gmail.com","6e2e71b4-c006-448e-be66-8465bda35747","tier-2","active","2/3/2021")
				).collect(Collectors.toList());
		repository.saveAll(users);
	}
    
	public static void main(String[] args) {
		SpringApplication.run(UseCaseLoginApplication.class, args);
	}

}
