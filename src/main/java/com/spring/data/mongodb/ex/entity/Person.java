package com.spring.data.mongodb.ex.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Document(collection =  "person")
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Person {

    private String name;

    private String job;
    
}