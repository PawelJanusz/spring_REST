package com.example.demo.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/book")
@RestController
public class BookController {

    private final BookRepository bookRepository;

    @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    @PostMapping
    public Book addBook(@RequestAttribute Book book){
        return this.bookRepository.save(book);

    }
}
