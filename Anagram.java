package assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		int len1 = text1.length();
		int len2 = text2.length();
		if(len1 == len2) {
			char[] new1 = text1.toCharArray();
			char[] new2 = text2.toCharArray();
			Arrays.sort(new1);
			Arrays.sort(new2);
			boolean result = Arrays.equals(new1, new2);
			if(result) {
				System.out.println("Given string is Anagram");
			}
		}

	}

}
