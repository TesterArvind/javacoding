package LoveBabbarSheet;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1=  "silent";
		String s2 = "listen";
		if(s1.length() != s2.length()) {
			System.out.println("Not Anagram");
		}
		
		char[] ar1 = s1.toCharArray();
		char[] ar2 = s2.toCharArray();
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		System.out.println(Arrays.equals(ar1, ar2));
		
	}

}
