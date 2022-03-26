package ggits;

public class StringDemo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "awapnila";
		String word2 = "swapnil";
		if(word1.charAt(0)<word2.charAt(0) || word1.length()<word2.length()) {
			System.out.println(word1+" "+word2);
		} else {
			System.out.println(word2+" "+word1);
		}
		
	}

}
