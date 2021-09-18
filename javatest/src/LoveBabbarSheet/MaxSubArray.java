package LoveBabbarSheet;

public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {-2,-3,4,1,-9,1,5,-9};
		
		int sum =0;
		int max = a[0];
		
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
			if(sum>max) {
				max= sum;
			}
			if(sum<0) {
				sum=0;
			}
			
		}
		System.out.println(max);

	}

}
