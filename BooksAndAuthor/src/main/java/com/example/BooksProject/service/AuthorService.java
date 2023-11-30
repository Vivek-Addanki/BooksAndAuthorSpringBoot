package com.example.BooksProject.service;

import com.example.BooksProject.model.Author;
import com.example.BooksProject.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public void saveAuthor(Author author) {
        authorRepository.save(author);
    }
    public List<Author> getAuthorsByName(String nameRegex) {
        return authorRepository.findByNameRegex(nameRegex);
    }
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }
}
