package io.javabrains.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import io.javabrains.entity.User;

public interface LoginRepository extends JpaRepository<User,Integer> {

	User findByUserName(String username);
	User findByCustomerSessionId(String customerSessionId);
		
}
