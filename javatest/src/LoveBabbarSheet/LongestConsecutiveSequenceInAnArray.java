package LoveBabbarSheet;

import java.util.Arrays;

public class LongestConsecutiveSequenceInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,9,3,10,4,20,2};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int count =0;
		
		for(int i=0; i<a.length-1; i++) {
			
			if(a[i+1] - a[i] == 1) {
				count++;
			}else {
				break;
			}
		}
		
		System.out.println(count+1);
	}

}
