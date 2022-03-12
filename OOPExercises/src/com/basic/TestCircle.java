package com.basic;

public class TestCircle {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println("The circle has radius of " + c1.getRadius() + " area of " 
		+ c1.getArea()+" and circumference of "+c1.getCircumference());
		Circle c2 = new Circle(2.0);
		System.out.println("The circle has radius of " + c2.getRadius() + " area of " 
		+ c2.getArea()+" and circumference of "+c2.getCircumference());
	}
}
