package com.githubt.dbutorchin.springbeginnertoexpert;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.githubt.dbutorchin.springbeginnertoexpert.algorithms.Search;
import com.githubt.dbutorchin.springbeginnertoexpert.algorithms.BinarySearch;
import com.githubt.dbutorchin.springbeginnertoexpert.algorithms.QuickSort;

@SpringBootApplication
public class SpringBeginnerToExpertApplication {

	public static void main(String[] args) {
		Search searchAlgorithm = new BinarySearch(new QuickSort());
		int index = searchAlgorithm.search(new int[] { 1, 2, 4, 6, 8 }, 6);
		System.out.println("Index is: " + index);
	}
}
