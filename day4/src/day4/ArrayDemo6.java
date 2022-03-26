package day4;

public class ArrayDemo6 {
	public static void main(String[] args) {
		int [][][] x = {
				{
					{1,2,3},
					{3,4,5},
					{5,6,7}
				},
				{
					{4,6,8},
					{1,4,9},
					{5,4,1}
				},
				{
					{9,8,7},
					{6,5,4},
					{3,2,1}
				}
		};
		
		for(int a[][]: x) {
			for(int b[] : a) {
				for(int c : b) {
					System.out.print(c+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}		
}
