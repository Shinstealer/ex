package com.spring.data.mongodb.ex.controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.spring.data.mongodb.ex.entity.Review;
import com.spring.data.mongodb.ex.service.ReviewService;
import com.spring.data.mongodb.ex.service.impl.ReviewServiceImpl;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/v1/mongo/review")
@Slf4j
public class ReviewRestController {

    private ReviewService reviewService;

    public ReviewRestController(ReviewServiceImpl reviewServiceImpl) {
        this.reviewService = reviewServiceImpl;
    }

    @PostMapping("/create")
    public String createReview(@RequestBody List<Review> reviews) {
        log.debug("saving reviews");
        reviewService.createReview(reviews);
        return "Review records created";
    }

    @GetMapping("/getAll")
    public Collection<Review> getAllReviews() {
        log.debug("get all reviews saved in db");
        return reviewService.getAllReviews();
    }

    @GetMapping("/get/{review_id}")
    public Optional<Review> getAReviewById(@PathVariable("review_id") int id) {
        log.debug("get a review by id :" + id);
        return reviewService.findAReviewById(id);
    }

    @PutMapping("/update/{review_id}")
    public String updateReviewById(@PathVariable("review_id") int id, Review review) {
        log.debug("update a review by id : " + id);
        review.setId(id);
        reviewService.updateReview(review);
        return "review for review-id = " + id + " updated";
    }

    @DeleteMapping("/delete/{review_id}")
    public String deleteReviewByid(@PathVariable("review_id") int id) {
        log.debug("deleting a review by id : " + id);
        reviewService.deleteAReviewById(id);
        return "success delete a review by id: " + id;
    }

    @DeleteMapping("/deleteAll")
    public String deleteAll() {
        log.debug("deleting all reviews");
        reviewService.deleteAllReview();
        return "All reviews records deleted";
    }

}
