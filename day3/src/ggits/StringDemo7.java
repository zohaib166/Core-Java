package ggits;

public class StringDemo7 {

	public static void main(String[] args) {
		String name = "gyan ganga institute-of technology and sciences";
		//System.out.println(name.replace('a', 'e'));
		//System.out.println(name.replaceAll("an", "aan"));
		//System.out.println(name.replaceFirst("g", "h"));
		String words[] = name.split("-");
		
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}
	}
}
