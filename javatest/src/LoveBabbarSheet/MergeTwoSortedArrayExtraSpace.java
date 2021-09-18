package LoveBabbarSheet;

import java.util.Arrays;

public class MergeTwoSortedArrayExtraSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {11,12,13};
		int[] b = {4,5,6};
		
		int i=0;
		int j=0;
		int k=0;
		
		int[] temp = new int[a.length + b.length];
		
		while(i < a.length && j < b.length) {
			if(a[i] <= b[j]) {
				temp[k++]= a[i];
				i++;
				
			} else if (a[i] > b[j]) {
				
				temp[k++]= b[j];
				j++;
			}
		}
		if(i == a.length) {
			while(j<b.length) {
				
				temp[k++]= b[j];
				j++;
			}
		}
		
		else if(j == b.length) {
			while(i < a.length) {
				
				temp[k++]= a[i];
				i++;
			}
		}
		
	
		
		System.out.println(Arrays.toString(temp));

	}

}
