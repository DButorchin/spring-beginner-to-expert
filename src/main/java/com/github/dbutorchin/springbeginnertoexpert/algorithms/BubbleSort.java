package com.github.dbutorchin.springbeginnertoexpert.algorithms;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSort implements Sort {

	@Override
	public int[] sort(int[] array) {
		return array;
	}
}
