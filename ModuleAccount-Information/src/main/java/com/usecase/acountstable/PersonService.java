package com.usecase.acountstable;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	
	@Autowired
    PersonRepository personRepository;

    public List<Person> getAllPersons() {
        List<Person> persons = new ArrayList<Person>();
        personRepository.findAll().forEach(person -> persons.add(person));
        return persons;
    }

    

    public void saveOrUpdate(Person person) {
        personRepository.save(person);
    }

    public void delete(String userid) {
        personRepository.deleteById(userid);
    }

	public Person findAllByuserid(String userid) {
		// TODO Auto-generated method stub
		 return personRepository.findAllByuserid(userid);
	}

}
