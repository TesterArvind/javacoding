package bootcampjava;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = new int[3][3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int row=0; row<arr.length; row++) {
			
			for (int col=0; col<arr.length; col++) {
				
				arr[row][col]=sc.nextInt();
			}
		}
		
         for(int row=0; row<arr.length; row++) {
			
			for (int col=0; col<arr.length; col++) {
				
				System.out.print(arr[row][col]);
			}
			System.out.println();
		}
		
     
	}

}
