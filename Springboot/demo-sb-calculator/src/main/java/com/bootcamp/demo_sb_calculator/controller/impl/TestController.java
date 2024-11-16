package com.bootcamp.demo_sb_calculator.controller.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootcamp.demo_sb_calculator.model.Book;

/* Spring will help validate if there is a bean for BookController,
 * if yes, Spring create TestController bean.
 * if no, Server start fail...  (because the above validation failed.)
 * 
 * @Controller + @Autowire
 */

@Controller // bean -> it will be scanned that the object needs to be created
// Get Object
@ResponseBody
public class TestController {
    
    // bookController object is from Spring Context

    // 1. field injection
    // @Autowired // inject bookController object from Spring Context into this obj ref
    // // This is what we called "Field Injection"
     private BookController bookController; // object reference, no object yet.

    // 2. constructor injection
    @Autowired //unnecessary
    // new TestController(bookController)
    public TestController(BookController bookController){
        this.bookController = bookController;
    }

    @GetMapping(value = "/test")
    public Book getBook() {
        return bookController.getBook(99, 100.9);
    }

}
