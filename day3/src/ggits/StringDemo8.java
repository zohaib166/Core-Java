package ggits;

public class StringDemo8 {
	public static void main(String[] args) {
		String x = "ZoHaIb"; //immutable
		char ch[] = x.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a' && ch[i]<='z') {
				ch[i] = (char) (ch[i] - 32); //type casting
			} else if(ch[i]>='A' && ch[i]<='Z') {
				ch[i] = (char) (ch[i] + 32);
			}
		}
		String str2 = new String(ch);
		System.out.println(str2);
	}
}
