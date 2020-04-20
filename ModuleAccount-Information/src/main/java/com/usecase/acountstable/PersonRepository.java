package com.usecase.acountstable;



import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, String> {

	

	Person findAllByuserid(String userid);} 


