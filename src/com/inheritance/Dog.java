package com.inheritance;

public class Dog extends Animal {
	public Dog() {
		super(3);
		System.out.println("A dog is created");
	}
	
	public void makeSound() { System.out.println("Woof"); }
	 
}
