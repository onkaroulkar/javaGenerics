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
2. Declaring Generic Classes
You can create your own generic classes using type parameters (T, E, K, V, etc.).
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class Box<T> {
    private T item;
    
    public void setItem(T item) { this.item = item; }
    public T getItem() { return item; }
}

public class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setItem(10);
        System.out.println(intBox.getItem()); // Output: 10

        Box<String> strBox = new Box<>();
        strBox.setItem("Java Generics");
        System.out.println(strBox.getItem()); // Output: Java Generics
    }
}

Here, Box<T> acts like a container that works with any type (Integer, String, etc.).
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
3. Generic Methods
Methods can also be generic, independent of the class type parameter:

public class Util {
    public static <T> void printItem(T item) {
        System.out.println(item);
    }

    public static void main(String[] args) {
        printItem(100);       // Works with Integer
        printItem("Hello");   // Works with String
        printItem(5.5);       // Works with Double
    }
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
4. Bounded Type Parameters
Sometimes, you want to restrict type parameters to a specific hierarchy (e.g., only accept subclasses of Number).
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class NumericBox<T extends Number> {
    private T number;
    
    public void setNumber(T number) { this.number = number; }
    public double getDoubleValue() { return number.doubleValue(); }
}

public class Main {
    public static void main(String[] args) {
        NumericBox<Integer> intBox = new NumericBox<>();
        intBox.setNumber(10);
        System.out.println(intBox.getDoubleValue()); // Output: 10.0
        
        // NumericBox<String> strBox = new NumericBox<>(); // Error: String is not a Number
    }
}
Here, T extends Number ensures T can be Integer, Double, Float, etc.
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
5. Wildcard (?) in Generics
Wildcards provide flexibility when working with unknown types.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
a) Unbounded Wildcards (<?>)
You can accept any type:

public static void printList(List<?> list) {
    for (Object obj : list) {
        System.out.println(obj);
    }
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
b) Upper Bounded Wildcards (<? extends T>)
Limits type to subclasses of T:

public static double sum(List<? extends Number> numbers) {
    double sum = 0;
    for (Number num : numbers) {
        sum += num.doubleValue();
    }
    return sum;
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
c) Lower Bounded Wildcards (<? super T>)
Limits type to superclasses of T:

public static void addIntegers(List<? super Integer> list) {
    list.add(10);
}
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

6. Generic Interfaces
You can also create interfaces with generics:

interface Container<T> {
    void add(T item);
    T retrieve();
}

class StringContainer implements Container<String> {
    private String item;

    public void add(String item) { this.item = item; }
    public String retrieve() { return item; }
}
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
7. Generic Constructors
Constructors can also be generic:

class Printer {
    <T> Printer(T item) {
        System.out.println(item);
    }
}

public class Main {
    public static void main(String[] args) {
        new Printer(100);        // Output: 100
        new Printer("Java");     // Output: Java
    }
}
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Summary
✔ Generics improve type safety
✔ Reduce the need for explicit casting
✔ Allow reusable components (classes, methods, interfaces)
✔ Wildcards (?) add flexibility for unknown types
Since you're already comfortable with Java’s data structures, this will help you write cleaner and scalable code! Do you want an example related to Set, Stack, or List? 🚀
=============================================================================================================================================================================




