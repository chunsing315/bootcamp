package com.bootcamp.yh_finance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class YhFinanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(YhFinanceApplication.class, args);
	}

}
