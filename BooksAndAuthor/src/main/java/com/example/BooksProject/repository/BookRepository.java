package com.example.BooksProject.repository;

import com.example.BooksProject.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, String> {
    List<Book> findByGenre(String genre);

    List<Book> findByGenreAndCopiesAvailableGreaterThan(String genre, int copiesAvailable);

    List<Book> findByAuthorIdIn(List<String> authorIds);
}
