package com.spring.data.mongodb.ex.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Optional;

import com.spring.data.mongodb.ex.entity.Person;
import com.spring.data.mongodb.ex.repository.PersonMongoDBRepository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DataMongoTest
public class SpringBootMongoDBTest {

    @Autowired
    PersonMongoDBRepository repository;

    @Test
    public void findbyname() {

        Optional<Person> byname = repository.findByName("tester");
        assertNotNull(byname);
        assertEquals(byname.get().getJob(), "engineer");
    }
}