package com.example.BooksProject.repository;

import com.example.BooksProject.model.Author;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AuthorRepository extends MongoRepository<Author, String> {
    List<Author> findByNameRegex(String nameRegex);
}
