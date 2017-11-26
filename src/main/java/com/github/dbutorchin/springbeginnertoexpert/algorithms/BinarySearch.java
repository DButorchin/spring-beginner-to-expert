package com.github.dbutorchin.springbeginnertoexpert.algorithms;

import org.springframework.stereotype.Component;

@Component
public class BinarySearch implements Search {

	private Sort sortingAlgorithm;

	public BinarySearch(Sort sortingAlgorithm) {
		this.sortingAlgorithm = sortingAlgorithm;
	}

	@Override
	public int search(int[] array, int number) {
		int[] sortedArray = sortingAlgorithm.sort(array);
		return sortedArray.length - 1;
	}
}
