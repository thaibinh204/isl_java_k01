package com.example.thymeleafdemo.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.thymeleafdemo.model.Person;

@Service
@Component
public interface PersonService {
	void save(Person person);

	List<Person> findAll();

	Person findById(Long id);
	
	void deleteById(Long id);
	
	void deleteByFirstName(String firstName, String lastName);
	
	List<Person> selectByLastName(String lastName);
	
	void updateNameById(Long id, String firstName, String lastName);

}
