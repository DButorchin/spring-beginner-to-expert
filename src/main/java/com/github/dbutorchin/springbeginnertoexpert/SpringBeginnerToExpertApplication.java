package com.github.dbutorchin.springbeginnertoexpert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.github.dbutorchin.springbeginnertoexpert.algorithms.Search;

@SpringBootApplication
public class SpringBeginnerToExpertApplication {

	public static void main(String[] args) {
		ApplicationContext context =
				SpringApplication.run(SpringBeginnerToExpertApplication.class, args);
		Search searchAlgorithm = context.getBean(Search.class);
		int index = searchAlgorithm.search(new int[] { 1, 2, 4, 6, 8 }, 6);
		System.out.println("Index is: " + index);
	}
}
