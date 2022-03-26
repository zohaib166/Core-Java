package var;

import java.util.Scanner;

public class Demo1 {
	//instance variable
	int x; //another memory //auto initialized
	//int 0
	//float double 0.0
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//primitive data type
		byte a; // 1 byte
		char b = 'c'; //2 byte 16 bit
		short c = 100; //2 byte
		int d = 34567; //4 byte
		long e = 12345467; //8 byte
		float f = 2.45f; //4 byte
		double g = 2.56; //8 byte
		
		/*
		 * Var name should not start with number, and should not be a keyword
		 * */
		//System.out.println("byte is: " + a);
		//System.out.println("char is: " + b);
		//var1 reference variable same as C pointers
		/*obj1*/Demo1 var1 = new Demo1();  ///is a remote control to instances of Demo1
		
		System.out.println("Instance var1 x: " + var1.x);
		//System.out.println("Instance var1 x: " + a);

	}
}
