package com.testeyoux.testeyoux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class TesteyouxApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteyouxApplication.class, args);
	}

}
