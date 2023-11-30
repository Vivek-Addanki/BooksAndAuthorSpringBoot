package com.example.BooksProject.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Address {
    private String houseNo;
    private String city;
    private String state;

}
