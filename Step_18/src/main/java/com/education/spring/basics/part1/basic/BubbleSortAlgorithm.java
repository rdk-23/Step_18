package com.education.spring.basics.part1.basic;

import org.springframework.beans.factory.annotation.Qualifier;
//This construction helps to tell Spring where is a bean:
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {
	public int[] sort(int[] numbers) {
		// Logic for Bubble Sort
		return numbers;
	}
}
