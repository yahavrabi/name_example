package com.yahavr.name_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NameExampleApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(NameExampleApplication.class, args);
		System.out.println("=====> app running....");
	}
	
}
