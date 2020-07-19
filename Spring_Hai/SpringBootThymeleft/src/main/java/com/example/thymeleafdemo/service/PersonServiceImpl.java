package com.example.thymeleafdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.thymeleafdemo.model.Person;
import com.example.thymeleafdemo.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonRepository personRepository;

	@Override
	public void save(Person person) {
		personRepository.save(person);

	}

	@Override
	public List<Person> findAll() {
		return personRepository.findAll();
	}

	@Override
	public Person findById(Long id) {
		return personRepository.getOne(id);
	}

	@Override
	public void deleteById(Long id) {
		personRepository.deleteById(id);

	}

	@Override
	public void deleteByFirstName(String firstName, String lastName) {
		personRepository.deleteByFirstName(firstName, lastName);

	}

	@Override
	public List<Person> selectByLastName(String lastName) {
		return personRepository.selectByLastName(lastName);
	}

	@Override
	public void updateNameById(Long id, String firstName, String lastName) {
		// TODO Auto-generated method stub

	}

}
