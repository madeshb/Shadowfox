package com.example.demo.service;


import com.example.demo.model.Book;
import com.example.demo.model.BookRecommendation;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.BookRecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookRecommendationRepository bookRecommendationRepository;

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public Book getBookByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    public List<Book> getRecommendedBooks(Long userId) {
        List<BookRecommendation> recommendations = bookRecommendationRepository.findByUserId(userId);
        
        // Now using getBookId to retrieve the bookId for each recommendation
        return recommendations.stream()
                .map(rec -> {
                    Optional<Book> book = bookRepository.findById(rec.getBookId());
                    return book.orElse(null); // returns null if book not found
                })
                .filter(book -> book != null) // filters out null books
                .collect(Collectors.toList());
    }

}
