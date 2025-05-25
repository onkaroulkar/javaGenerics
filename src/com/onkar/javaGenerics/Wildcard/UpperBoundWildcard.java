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
=======================================================================================================================================================================
Java Generics allow you to create classes, interfaces, and methods with type parameters, making code more reusable and type-safe. They help eliminate type casting and 
reduce runtime errors. Let’s break this down step by step.

1. Why Use Generics?
Without generics, you would have to store objects in collections like ArrayList and manually cast them when retrieving:

ArrayList list = new ArrayList();
list.add("Hello");
String str = (String) list.get(0); // Needs explicit casting

Generics solve this by enforcing type safety at compile time:
ArrayList<String> list = new ArrayList<>();
list.add("Hello");
String str = list.get(0); // No casting needed
------------------------------------------------------------------------------------------------------------------------------------------------------------------------




