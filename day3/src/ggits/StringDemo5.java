package ggits;

public class StringDemo5 {
	public static void main(String[] args) {
		String str = "Mathematics";
		System.out.println(str.substring(6));
		System.out.println(str.substring(0,5));
		System.out.println(str.indexOf('t'));
		System.out.println(str.indexOf("tics"));
		System.out.println(str.indexOf('t',3));
		System.out.println(str.indexOf("Ma".toLowerCase(),2));
	}
}
