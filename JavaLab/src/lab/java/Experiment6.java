package lab.java;

class Calculator {
	private static double result;
	public static long powerInt(int num1, int num2) {
		result = Math.pow(num1, num2);
		return (long)result;
	}
	public static double powerDouble(double num1, int num2) {
		result = Math.pow(num1, num2);
		return result;
	}
}
public class Experiment6 {
	public static void main(String[] args) {
		int op1=7, op2=3;
		System.out.println("Using powerInt: "+Calculator.powerInt(op1, op2));
		double op3=5.67;
		int op4=2;
		System.out.println("Using powerDouble: "+Calculator.powerDouble(op3, op4));
	}
}
