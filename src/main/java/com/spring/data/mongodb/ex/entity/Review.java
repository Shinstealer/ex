package com.spring.data.mongodb.ex.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "review")
@Getter
@Setter
@ToString
public class Review {
    
    @Id
    private int id;

    private String nickName;
    private String content;
}
