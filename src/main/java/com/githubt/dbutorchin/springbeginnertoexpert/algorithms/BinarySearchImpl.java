package com.githubt.dbutorchin.springbeginnertoexpert.algorithms;

public class BinarySearchImpl implements BinarySearch {

	@Override
	public int search(int[] array, int number) {
		Sorting sortingAlgorithm = new QuickSort();
		int[] sortedArray = sortingAlgorithm.sort(array);
		return sortedArray.length - 1;
	}
}
