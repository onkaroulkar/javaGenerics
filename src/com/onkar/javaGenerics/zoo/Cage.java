package com.onkar.javaGenerics.zoo;

public class Cage<M extends Animal & Runs & Eats>{
	
	private M animal1;
	private M animal2;
	 
	public Cage() {
		
	}
	
	public Cage(M animal1, M animal2) {
		this.animal1 = animal1;
		this.animal2 = animal2;
	}
	
	public void setAnimal1(M animal1) {
		this.animal1 = animal1;
	}
	
	public void setAnimal2(M animal2) {
		this.animal2 = animal2;
	}
	
	public M getAnimal1() {
		return animal1;
	}
	 
	public M getAnimal2() {
		return animal2;
	}
	
	public boolean idCompatible() {
		return animal1.getType().equals(animal2.getType());
	}
	
	public void feedAnimal() {
		animal1.eat();
		animal2.eat();
	}
	
	public void runMovement() {
		animal1.run();
		animal2.run();
	}
}
