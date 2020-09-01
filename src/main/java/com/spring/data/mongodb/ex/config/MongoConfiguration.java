package com.spring.data.mongodb.ex.config;

import com.mongodb.client.MongoClient;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

@Configuration
public class MongoConfiguration extends AbstractMongoClientConfiguration{

    @Override
    public MongoClient mongoClient() {
        
        return super.mongoClient();
    }


    @Override
    protected String getDatabaseName() {
        
        return "testdb";
    }
    
}