package day4;

public class ArrayDemo1 {

	public static void main(String args[]) {
		int [] arr; //declared not initialized
		int [] arr2 = new int[] {0,1,2,3,4,5}; //Initialize using traditional method
		//int arr2[5]; C way not allowed
		int [] arr3 = {0}; //size is not known
		//System.out.println(arr3[1]); //AIOOB exception
		
		/*for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}*/
		int sum=0;
		for(int x:arr2) {
			//System.out.println(x);
			sum = sum + x;
		}
		
		System.out.println(sum);
	}
}
