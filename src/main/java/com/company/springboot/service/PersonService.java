package com.company.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.springboot.model.Person;
import com.company.springboot.repository.PersonRespository;

@Service
public class PersonService {

	@Autowired
	PersonRespository repo;

	public List<Person> findAll() {
		List<Person> persons = new ArrayList<>();
		repo.findAll().forEach(persons::add);
		return persons;

	}

	public int addPerson(Person person) {
		repo.save(person);
		return 0;
	}

	public Optional<Person> findOne(int id) {
		return repo.findById(id);

	}

	public Person UpdateOne(Person person, int id) {
		return repo.save(person);
	}

	public int deleteOne(int id) {
		repo.deleteById(id);
		return id;
	}

}
