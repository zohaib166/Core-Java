package day4;
public class ArrayDemo4 {
	public static void main(String[] args) {
		String words[] = {"apple", "orange", "guava"};
		//String [] words = new String[6]; //6 references are created
		/*for(String s:words) {
			System.out.println(s.charAt(0));
		}*/
		for(int k=0;k<words.length;k++) {
			System.out.println(words[k].length());
		}
	}
}
