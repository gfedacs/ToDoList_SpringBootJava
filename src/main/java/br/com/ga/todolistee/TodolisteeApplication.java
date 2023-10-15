package br.com.ga.todolistee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodolisteeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodolisteeApplication.class, args);

		System.out.println("Chegou");
	}

}
