package ggits;

public class StringDemo11 {

	public static void main(String[] args) {
		String str = "Hello.how.are.you";
		String words[] = str.split("\\.");
		String rev = "";
		for(int i=words.length-1;i>=0;i--) {
			rev = rev + words[i] + ".";
		}
		rev = rev.substring(0, rev.length()-1);
		System.out.println(rev);
	}

}
