package Level1Array;

import java.util.Arrays;

public class ZeroOneTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,0,2,0,2,1,1,0,0,0,0,0,0,0,0,0,0};
		int l=0;
		int m=0;
		int h=a.length-1;

		while(m<=h) {

			if(a[m] ==0) {

				int temp = a[l];
				a[l]=a[m];
				a[m] =temp;
				l++;
				m++;
			} else if(a[m]==2) {
				int temp = a[h];
				a[h]=a[m];
				a[m] =temp;
				h--;
//				m++;
			} else {
				m++;
			}  
		}

		System.out.println(Arrays.toString(a));
		
	}	
	
}
