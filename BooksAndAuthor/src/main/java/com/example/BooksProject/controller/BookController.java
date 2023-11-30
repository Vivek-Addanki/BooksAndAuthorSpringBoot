package com.example.BooksProject.controller;

import com.example.BooksProject.model.Book;
import com.example.BooksProject.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/all")
    public ResponseEntity<List<Book>> getAllBooks() {

        List<Book> books = bookService.getAllBooks();
        return ResponseEntity.ok(books);
    }

    @GetMapping("/by-genre")
    public ResponseEntity<List<Book>> getBooksByGenre(@RequestParam String genre) {

        List<Book> books = bookService.getBooksByGenre(genre);
        return ResponseEntity.ok(books);
    }

    @GetMapping("/by-genre-and-copies")
    public List<Book> getBooksByGenreAndCopiesAvailable(
            @RequestParam String genre,
            @RequestParam int copiesAvailable
    ) {
        return bookService.getBooksByGenreAndCopiesAvailable(genre, copiesAvailable);
    }

    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        Book savedBook=bookService.saveBook(book);
        return ResponseEntity.ok(savedBook);
    }
    @GetMapping("/by-authors")
    public List<Book> getBooksByAuthors(@RequestParam List<String> authorIds) {
        return bookService.getBooksByAuthors(authorIds);
    }
}
