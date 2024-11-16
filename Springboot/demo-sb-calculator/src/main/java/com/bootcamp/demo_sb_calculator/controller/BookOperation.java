package com.bootcamp.demo_sb_calculator.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.bootcamp.demo_sb_calculator.model.Bag;
import com.bootcamp.demo_sb_calculator.model.Book;

public interface BookOperation {
    @GetMapping(value = "/book/{id}/{price}")
    public Book getBook(@PathVariable Integer id, @PathVariable double price);;

    @GetMapping(value = "/book")
    // http://localhost:2024/book?A=1&B=100
    public Book getBook2(@RequestParam(value = "A") Integer id, @RequestParam(value = "B") double price);

    @GetMapping(value = "/bookSet")
    public Set<Book> getBookSet();

    @GetMapping(value = "/bookList")
    public List<Book> getBookList();

    @GetMapping(value = "/bookMap")
    public Map<String, List<Book>> getBookMap();

    @GetMapping(value = "/bookArray")
    public Book[] getBookArray();

    @GetMapping(value = "/bag")
    public Bag getBag();
}