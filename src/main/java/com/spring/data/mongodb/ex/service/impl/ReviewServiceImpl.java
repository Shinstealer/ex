package com.spring.data.mongodb.ex.service.impl;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.spring.data.mongodb.ex.entity.Review;
import com.spring.data.mongodb.ex.repository.ReviewMongoDBRepository;
import com.spring.data.mongodb.ex.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewMongoDBRepository repository;

    @Override
    public void createReview(List<Review> reviews) {

        repository.saveAll(reviews);
    }

    @Override
    public Collection<Review> getAllReviews() {

        return repository.findAll();
    }

    @Override
    public Optional<Review> findAReviewById(int id) {

        return repository.findById(id);
    }

    @Override
    public void deleteAReviewById(int id) {
        repository.deleteById(id);

    }

    @Override
    public void updateReview(Review review) {
        repository.save(review);

    }

    @Override
    public void deleteAllReview() {
        repository.deleteAll();

    }

}
