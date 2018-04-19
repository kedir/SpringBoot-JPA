package com.company.springboot.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.company.springboot.model.Person;

@Repository
public interface PersonRespository extends CrudRepository<Person, Integer> {

}
