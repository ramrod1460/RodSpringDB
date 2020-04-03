package com.training.springexample.dao;

import org.springframework.stereotype.Repository;

import com.training.springexample.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgres")//referred to in PersonService
public class PersonDataAccessService implements PersonDao{


    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }

    @Override
    public List<Person> selectAllPeople() {
        //return List.of(new Person(UUID.randomUUID(), "From Postgres db")); would work on java 9 or higher
        return null;
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deletePersonById(UUID id) {
        return 0;
    }

    @Override
    public int updatePersonById(UUID id, Person person) {
        return 0;
    }
}
