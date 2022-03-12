package com.basic;

public class Rectangle {
	private float length;
	private float width;
	public Rectangle() {
		length = 1.0f;
		width = 1.0f;
	}
	
	public Rectangle(float l, float w) {
		length = l;
		width = w;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}
	
	public float getArea() {
		return length*width;
	}
	
	public float getPerimeter() {
		return 2*(length+width);
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	
}
