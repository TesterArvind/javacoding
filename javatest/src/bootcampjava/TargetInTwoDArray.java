package bootcampjava;

import java.util.Arrays;

public class TargetInTwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = {
				{1,2,3},
				{3,5,6},
				{9,34,45}
				};
		
		int target =343;
		System.out.println(Arrays.toString(isPresent(a, target)));

	}
	
	static int[] isPresent(int[][] ar, int target) {
		
		for(int row=0; row<ar.length; row++) {
			for (int col=0; col<ar[row].length; col++) {
				
				if(ar[row][col] == target) {
				return new int[]{row,col};	
				}
			}
		}
		
		return new int[]{-1,-1};
		
	}

}
