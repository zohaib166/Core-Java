package lab.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Experiment3 {
	public static void main(String[] args) {
		System.out.println("Enter a sentence to count the number of words: ");
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		int wordCount = 0;
		boolean INWORD = false;
		try {
			String line = br.readLine();

			int i=0;
			while(i < line.length()) {
				if(line.charAt(i)==' ' || line.charAt(i)=='\t' 
						|| line.charAt(i)=='\n') {
					INWORD = false;
				} else if(INWORD==false) {
					INWORD = true;
					wordCount++;
				}
				i++;
			}
			System.out.println("Number of words in the sentence: "+wordCount);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
