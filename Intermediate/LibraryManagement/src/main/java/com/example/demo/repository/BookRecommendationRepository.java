package com.example.demo.repository;

import com.example.demo.model.BookRecommendation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRecommendationRepository extends JpaRepository<BookRecommendation, Long> {
    List<BookRecommendation> findByUserId(Long userId);
}