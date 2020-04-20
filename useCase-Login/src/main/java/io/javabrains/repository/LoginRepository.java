package io.javabrains.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import io.javabrains.entity.User;

public interface LoginRepository extends JpaRepository<User,Integer> {

	User findByUserName(String username);
	
	@Query(value="SELECT  Customer_Session_Id,customer_type,Session_status,last_login_date FROM USR_TABLE",nativeQuery=true) List<Object> getValues();

	
		
}
