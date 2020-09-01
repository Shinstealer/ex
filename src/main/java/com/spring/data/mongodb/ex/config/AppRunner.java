package com.spring.data.mongodb.ex.config;

import com.spring.data.mongodb.ex.entity.Person;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    private MongoTemplate MongoTemplate;

    public AppRunner(MongoTemplate MongoTemplate) {
        this.MongoTemplate = MongoTemplate;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        String name = "tester";
        String job = "engineer";
        Person p = new Person(name, job);
        MongoTemplate.insert(p);

    }

}