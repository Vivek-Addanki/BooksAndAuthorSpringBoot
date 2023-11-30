package com.example.BooksProject.service;

import com.example.BooksProject.model.Book;
import com.example.BooksProject.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public List<Book> getBooksByGenre(String genre) {
        return bookRepository.findByGenre(genre);
    }
    public List<Book> getBooksByGenreAndCopiesAvailable(String genre, int copiesAvailable) {
        return bookRepository.findByGenreAndCopiesAvailableGreaterThan(genre, copiesAvailable);
    }
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }
    public List<Book> getBooksByAuthors(List<String> authorIds) {
        return bookRepository.findByAuthorIdIn(authorIds);
    }
}
