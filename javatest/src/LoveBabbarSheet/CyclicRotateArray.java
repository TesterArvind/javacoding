package LoveBabbarSheet;

import java.util.Arrays;

public class CyclicRotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = {9, 8, 7, 6, 4, 2, 1, 3};
		
//		Output:
//	    5 1 2 3 4
		
		int temp = A[A.length-1];
		
		for(int i=0; i <A.length-1; i++) {
			
			A[A.length-1-i] =A[A.length-1-i-1];	
		}
		
        A[0]=temp;
        
        System.out.println(Arrays.toString(A));
	}

}
