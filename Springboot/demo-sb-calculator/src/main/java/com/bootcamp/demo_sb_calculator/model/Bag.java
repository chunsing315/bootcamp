package com.bootcamp.demo_sb_calculator.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor  
@Builder

public class Bag {
    @JsonProperty (value = "the_list_of_the_books:")
    private List<Book> books;
    private Color color;
    
    public static enum Color{
            RED, YELLOW, BLUE,;
    }
}
