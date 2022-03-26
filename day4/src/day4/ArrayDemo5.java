package day4;

public class ArrayDemo5 {

	public static void main(String[] args) {
		int x[] = {1, 2, 3, 4, 5, 13};
				// 0  1  2  3  4  5
		System.out.println(sameFirstLast(x));
	}
	public static boolean sameFirstLast(int[] nums) {
		System.out.println(nums.length);
		if(nums.length>=1) {
			if(nums[0]==nums[nums.length-1]) {
				return true;
			}
		} else {
			return false;
		}
		return true;
	}


}
