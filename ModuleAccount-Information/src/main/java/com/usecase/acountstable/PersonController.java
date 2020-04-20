package com.usecase.acountstable;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	 @Autowired
	    PersonService personService;

	    @GetMapping("/persons")
	    private List<Person> getAllPersons() {
	        return personService.getAllPersons();
	    }

	    @GetMapping("/persons/{userid}")
	    private Person getPerson(@PathVariable("userid") String userid) {
	        return personService.findAllByuserid(userid);
	    }

	    @DeleteMapping("/persons/{userid}")
	    private void deletePerson(@PathVariable("userid") String userid) {
	        personService.delete(userid);
	    }

	    @PostMapping("/persons")
	    private int savePerson(@RequestBody Person person) {
	        personService.saveOrUpdate(person);
	        return person.getAccountnumber();
	    }

}
