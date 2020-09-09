package com.spring.data.mongodb.ex.repository;

import com.spring.data.mongodb.ex.entity.Review;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewMongoDBRepository extends MongoRepository<Review, Integer> {


}
