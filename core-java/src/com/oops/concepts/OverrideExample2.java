package com.oops.concepts;

class Place {
	public Place() {
		// TODO Auto-generated constructor stub
		System.out.println("inside the place method!!!!!!!!!!!");
	}
}

class Word extends Place{
	public Word() {
		// TODO Auto-generated constructor stub
		System.out.println("inside the the work method!!!!!!!!!!");
	}
}
public class OverrideExample2 {
	public static void main(String[] args) {
	//	Word word = new Word();
		Animal animal = new Bird();
		
	}
}

class Animal {
	public Animal() {
		System.out.println("A new animal has been created!");
	}
	
	public void sleep() {
		System.out.println("An animal sleeps...");
	}
	
	public void eat() {
		System.out.println("An animal eats...");
	}
}

class Bird extends Animal {
	public Bird() {
		super();
		System.out.println("A new bird has been created!");
	}
	
	@Override
	public void sleep() {
		System.out.println("A bird sleeps...");
	}
	
	@Override
	public void eat() {
		System.out.println("A bird eats...");
	}
}