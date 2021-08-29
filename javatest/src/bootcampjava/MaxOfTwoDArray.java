package bootcampjava;

import java.util.Arrays;

public class MaxOfTwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			int[][] a = {
					{1,990,3},
					{3,5,6},
					{9,34,45}
					};
			
			
			System.out.println(max(a));

		}
		
		static int max(int[][] ar) {
			
			int max = ar[0][0];
			
			for(int row=0; row<ar.length; row++) {
				for (int col=0; col<ar[row].length; col++) {
					
					if(ar[row][col] > max) {
						max= ar[row][col];
						
						
					}
				}
			}
			
			return max;
			
		}


}
