package com.bootcamp.demo_sb_calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// ! 1. @SpringBootConfiguration
// ! 2. @EnableAutoConfiguration
// ! 3. @ComponentScan(
// What is Component?
// @Controller
// a class that is used to create Bean. We call this class Component. i.e.
// Controller
// -- What is Bean?
// -- The object lifecycle is managed by someone, but not you.
// -- In Spring, most of the beans are created during server start.
//
// When server starts, scan the whole spring project, to find any beans (class
// with component annotation)
// Component annotations: @Controller, @Service, @Configuration, @Repository
// all we have to do is autowired
public class DemoSbCalculatorApplication {

	public static ConfigurableApplicationContext springContext;

	public static void main(String[] args) {
		// it return something. COnfigurableApplicationContext
		// this is spring context
		DemoSbCalculatorApplication.springContext = SpringApplication.run(DemoSbCalculatorApplication.class, args);

	}

	// Spring Boot Application
	// 1. main code compile [OK]
	// 2. Server Starts -> Component Scan, Create Component, Prep SpringContext
	// 3. Runtime - Client (browser) is able to call the server => an app that never ends


}
