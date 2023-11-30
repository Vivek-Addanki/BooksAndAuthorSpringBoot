package com.example.BooksProject.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Book")
public class Book {
    @Id
    private String id;
    private int copiesAvailable;
    private String authorId;
    private String genre;


    public void setCopiesAvailable(int copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getCopiesAvailable() {
        return copiesAvailable;
    }
    public String getAuthorId() {
        return authorId;
    }
    public String getGenre() {
        return genre;
    }
}
