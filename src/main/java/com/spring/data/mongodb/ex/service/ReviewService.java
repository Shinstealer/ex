package com.spring.data.mongodb.ex.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.spring.data.mongodb.ex.entity.Review;

public interface ReviewService {

    public void createReview(List<Review> reviews);

    public Collection<Review> getAllReviews();

    public Optional<Review> findAReviewById(int id);

    public void deleteAReviewById(int id);

    public void updateReview(Review review);

    public void deleteAllReview();

}
