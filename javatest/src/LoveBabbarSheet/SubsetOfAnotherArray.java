package LoveBabbarSheet;

import java.util.HashSet;

public class SubsetOfAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1, 2, 3, 4, 5, 6};
		int[] b= {1, 2, 4};
		
		System.out.println(isSubSet(a, b));

	}
	
	
	public static boolean isSubSet(int[] a, int[] b) {
		
		HashSet<Integer> hs= new HashSet<>();
		for(int current : a) {
			hs.add(current);
		}
		
		for(int current : b) {
		   if (hs.add(current)) {
			   return false;
		   }
		}
		return true;

	}
}

