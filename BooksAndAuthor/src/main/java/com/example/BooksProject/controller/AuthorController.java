package com.example.BooksProject.controller;

import com.example.BooksProject.model.Author;
import com.example.BooksProject.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    @Autowired
    private AuthorService authorService;
    @GetMapping
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }
    @PostMapping
    public ResponseEntity<String> saveAuthor(@RequestBody Author author) {
        authorService.saveAuthor(author);
        return ResponseEntity.ok("Author saved successfully");
    }
    @GetMapping("/by-name")
    public List<Author> getAuthorsByName(@RequestParam String nameRegex) {
        return authorService.getAuthorsByName(nameRegex);
    }
}
