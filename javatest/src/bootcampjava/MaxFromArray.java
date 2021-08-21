package bootcampjava;

public class MaxFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {234,123,123,454,234,21};
		
		System.out.println(max(a));
	
	}
	
	static int max(int[] arr) {
		
		int max= arr[0];
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		
		return max;
	}

}
