package com.bootcamp.demo_sb_calculator.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Serialization: Java Object ->  JSON plain text

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private Integer BookId;
    private double price;
    private List<String> chapters;

    public Book(Integer BookId, double price) {
        this.BookId = BookId;
        this.price = price;
        this.chapters = null;
    }

}
