package LoveBabbarSheet;

import java.util.Arrays;

public class MoveNegativeToOneSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {-12,3,4,-2,4,-2,5,-90};
		
		int temp[] = new int[a.length];
		
		
		int j = a.length-1;
		int k=0;
		for(int i=0; i<a.length; i++) {
			
			if(a[i]<0) {
				
				temp[k++]=a[i];
			}
			else {
				
				temp[j--]=a[i];
			}
		}
		
		System.out.println(Arrays.toString(temp));

	}

}
