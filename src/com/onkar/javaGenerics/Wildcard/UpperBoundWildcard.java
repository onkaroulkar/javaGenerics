package com.onkar.javaGenerics.Wildcard;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildcard {
	
	private void psvam() {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		printNumbers(numbers);
		
		List<Double> doubles = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		printNumbers(doubles);
		String str = new String();
	}

	private void printNumbers(List<? extends Number> numbers) {
		numbers.forEach(System.out::println);
		Object adf = numbers.get(0);
		Number num = numbers.get(0);
	}
}
