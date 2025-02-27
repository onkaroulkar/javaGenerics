package com.onkar.javaGenerics.zoo;

public class Zoo {

	public static void main(String[] args) {
		
		Cage<Monkey> cage = new Cage<Monkey>(new Monkey(),new Monkey());
		
		/*
		 * Cage<Monkey> cage = new Cage<Monkey>(); cage.setAnimal1(new Monkey());
		 * cage.setAnimal2(new Monkey());
		 * 
		 * Cage<Lion> lionCage = new Cage<Lion>(); lionCage.setAnimal1(new Lion());
		 * lionCage.setAnimal2(new Lion());
		 */
	}

}
