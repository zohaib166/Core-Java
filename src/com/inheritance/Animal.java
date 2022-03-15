package com.inheritance;

public class Animal {
	int legs;
	int tail;
	
	public Animal() {
		System.out.println("An animal is created");
	}
	public Animal(int x) {
		System.out.println("Animal with argument: "+x);
	}
	protected void makeSound() {
		System.out.println("I make various sounds");
	}
}
