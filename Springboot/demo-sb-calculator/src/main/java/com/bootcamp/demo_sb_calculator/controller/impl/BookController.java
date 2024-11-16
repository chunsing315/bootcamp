package com.bootcamp.demo_sb_calculator.controller.impl;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootcamp.demo_sb_calculator.controller.BookOperation;
import com.bootcamp.demo_sb_calculator.model.Bag;
import com.bootcamp.demo_sb_calculator.model.Book;
import com.bootcamp.demo_sb_calculator.model.Bag.Color;

@ResponseBody
@Controller
// @Controller annotation -> Before server start completed ->new BookController(). 
// before start, new controller object.  It is not manually new objcet.  
// you don't see new BookController (actively new object) for the method.
// Where is the created object?
// -- it will be in Spring Context (not the heap memory, it is separated by memory location
// -- Al these kind of objects is called them "bean"

// Let's take a closer look.
// we can call the instance methods, i.e. getBook, getBook2. But remember we never new the Object of BookController
// That means someone new the BookController for us.  That is the @Controller in the framework that did it for us.


// This bean MUST be created before server start completed.  
// If the bean failed to create, the server start fails.

// This Class doesn't have attribute, hence no state -> we focus on the behavior, instead of the memory
// Spring framework help us new one object, so no matter how many requests coming in, we use the same controller bean
// stateless API
public class BookController implements BookOperation {
    // private int age; -> we don't see this in the Controller

    public Book getBook(@PathVariable Integer id, @PathVariable double price) {
        return new Book(id, price, null);
    }

    public Book getBook2(@RequestParam(value = "A") Integer id, @RequestParam(value = "B") double price) {
        return new Book(id, price, null);
    }

    public Set<Book> getBookSet() {
        return Set.of(new Book(1, 10.3, null), new Book(2, 99.9, null));
    }

    public List<Book> getBookList() {
        return List.of(new Book(1, 10.3, null), new Book(2, 99.9, null));
    }

    public Map<String, List<Book>> getBookMap() {
        Map<String, List<Book>> bookmap = new HashMap<>();
        bookmap.put("Steven King", List.of(new Book(1, 10.3),
                new Book(2, 99), //
                new Book(3, 110.3, List.of("Chapter 1: the new Begining...", "Chapter 2: Empire Strikes Back")), //
                new Book(4, 199, null)));
        bookmap.put("Wong Kar Wai", List.of(new Book(5, 110.3, null), new Book(6, 199, null)));
        return bookmap;
    }

    public Book[] getBookArray() {
        return new Book[] { new Book(1, 10.3, List.of("ch1", "ch2")), new Book(2, 99.9, List.of("ch1", "ch2")) };
    }

    public Bag getBag() {
        return Bag.builder() //
                .books(List.of(new Book(1, 10.3, List.of("ch1", "ch2")), //
                        new Book(2, 99.9, List.of("chapter-0", "chapter-1")))) //
                .color(Color.RED)
                .build();
    }
}
