package com.basic;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(1.2f, 3.4f);
		System.out.println(r1); // toString()
		Rectangle r2 = new Rectangle(); // default constructor
		System.out.println(r2);

		// Test setters and getters
		r1.setLength(5.6f);
		r1.setWidth(7.8f);
		System.out.println(r1); // toString()
		System.out.println("length is: " + r1.getLength());
		System.out.println("width is: " + r1.getWidth());

		// Test getArea() and getPerimeter()
		System.out.printf("area is: %.2f%n", r1.getArea());
		System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());
	}
}
