package javatesting;

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4};
		for(int i=0; i<arr.length/2; i++) {
			
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
			
		}
       for(int c:arr) {
    	   System.out.println(c);
       }
	}

}
