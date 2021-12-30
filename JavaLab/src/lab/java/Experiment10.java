package lab.java;

class Circle {
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	public double findArea() {
		return Math.PI*Math.pow(radius,2);
	}
}

interface Shape {
	public void display();
}

class Cylinder extends Circle implements Shape {
	private double height;
	public Cylinder(double height, double radius) {
		super(radius);
		this.height = height;
	}
	public double findVolume() {
		double volume=0.0;
		volume = findArea()*height;
		return volume;
	}
	public void display() {
		System.out.println("I am a cylinder, I have two Circles.");
	}
}
public class Experiment10 {

	public static void main(String[] args) {
		Cylinder obj = new Cylinder(5,2.5);
		obj.display();
		System.out.println("Volume of Cylinder is: ");
		System.out.printf("%.2f",obj.findVolume());
	}

}
