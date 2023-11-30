package com.example.BooksProject.dto;

import com.example.BooksProject.model.Book;

public class DataTransferObject {
    private Book book;
    private String authorName;


    public Book getBook() {
        return book;
    }

    public String getAuthorName() {
        return authorName;
    }

}
