package com.spring.data.mongodb.ex.repository;

import java.util.Optional;

import com.spring.data.mongodb.ex.entity.Person;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonMongoDBRepository extends MongoRepository<Person, String> {

    Optional<Person> findByName(String name);
}