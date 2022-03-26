package ggits.ece;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Demo1 x = new Demo1(); //instance 1 created
		Demo1 y = new Demo1(); //instance 2 created
		if(x.isEven(num)) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		sc.close();
	}
	public boolean isEven(int num) {
		//In java 0 is not same as false unlike C
		if(num%2==0) {
			return true;
		} else {
			return false;
		}
	}

}
