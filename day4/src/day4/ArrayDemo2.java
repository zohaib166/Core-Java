package day4;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int x[] = new int[] {10,12,13,14,15};
		sum(x);
	}
	
	public static void sum(int num[]) {
		int sum=0;
		for(int i:num) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
