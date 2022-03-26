package ggits;

public class StringDemo9 {
	public static void main(String[] args) {
		String x = "zohaib"; //immutable
		char ch[] = x.toCharArray();
		ch[0] = (char) (ch[0]-32);
		System.out.println(new String(ch)); //converting char array string
	}
}
