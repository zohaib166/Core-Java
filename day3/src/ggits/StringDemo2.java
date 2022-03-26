package ggits;

public class StringDemo2 {
	public static void main(String[] args) {
		//String s1 = "Zohaib "; //string literals 
		//String s2 = "zohaib"; //string literals
		String s1 = new String("ZOHAIB HASAN"); //new object
		String s2 = new String("ZOHAIB HASAN"); //new object
		System.out.println("Before trimming: "+s1.equalsIgnoreCase(s2)); //content comparison
		s2 = s2.trim();
		System.out.println("After trimming: "+s1.equalsIgnoreCase(s2)); //content comparison
	}
}
