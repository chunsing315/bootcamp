package com.bootcamp.tutorial_practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling //  Inject other beans into context
public class TutorialPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialPracticeApplication.class, args);
	}

}
