package Level1Array;

public class PeekElement {

	public static void main(String[] args) {
		
		int[] arr = {1,2,4,3,89,3};
		
		for(int i=0; i<arr.length; i++) {
			
		if(i!=0 && i!=arr.length) {
			
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1] ) {
				
				System.out.println(arr[i]);
			}
		}
	}

	}

}
