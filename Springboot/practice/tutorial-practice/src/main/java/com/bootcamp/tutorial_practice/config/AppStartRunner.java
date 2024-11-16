package com.bootcamp.tutorial_practice.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/* 
// Someone wrote this already
// @Autowired(required = false)
 * private CommandLineRunner commandLineRunner;
 * 
 * e.g.
 * 
 * if (commandLineRunner != null){
 * commandLineRunner.run()}
 */

@Component // create a bean for non controller, non web layer

// This is the best place to do health check:

/*  Check:
 Database ready? 
 */

public class AppStartRunner implements CommandLineRunner {
    /* ! CommandLineRunner is used for things that must be done before server starts; */
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World!");

    };
}
