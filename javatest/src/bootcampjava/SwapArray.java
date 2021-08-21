package bootcampjava;

import java.util.Arrays;

public class SwapArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = {2,4,3,1,5};
		
		swap(arr, 0,4);
		System.out.println(Arrays.toString(arr));

	}
	
	static void swap(int[] a, int index1, int index2) {
		
		int temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;	
		
	}

}
