package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/add")
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @GetMapping("/all")
    public List<Book> getAllBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/recommendations/{userId}")
    public List<Book> getRecommendedBooks(@PathVariable Long userId) {
        return bookService.getRecommendedBooks(userId);
    }

    @GetMapping("/search")
    public Book getBookDetails(@RequestParam String title) {
        return bookService.getBookByTitle(title);
    }
}
