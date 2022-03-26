package day4;

public class ArrayDemo3 {

	public static void main(String[] args) {
		int x[] = new int[5];
		x = fill(x);
		for(int i:x) {
			System.out.println(i);
		}

	}
	public static int[] fill(int[] num) {
		for(int i=0;i<num.length;i++) {
			num[i] = i;
		}
		return num;
	}
}
