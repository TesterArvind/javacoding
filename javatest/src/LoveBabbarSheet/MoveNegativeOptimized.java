package LoveBabbarSheet;

public class MoveNegativeOptimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,-3,8,-4};
		
		int l=0;
		int p=0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]<0) {
				int temp =arr[p];
				arr[p]=arr[i];
				arr[i]=temp;
				p++;
			}
			
		}
		

	}

}
