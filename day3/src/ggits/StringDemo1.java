package ggits;

public class StringDemo1 {
	public static void main(String[] args) {
		//String s1 = "zohaib"; //string literals 
		//String s2 = "zohaib"; //string literals
		String s1 = new String("zohaib"); //new object
		String s2 = new String("zohaib"); //new object
		s1 = s2; //object pointed by s2 is now lawaris
		System.out.println(s1==s2);
	}
}
