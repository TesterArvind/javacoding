package bootcampjava;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] b = {1,2,34,35,234,1234};
		int tar = 234;
		System.out.println(binarySearch(b,tar));

	}
	
	static int binarySearch(int[] a, int target) {
		int s=0;
		int e=a.length-1;
		
		while(s < e) {
		int mid = (s+e)/2;
			
		if(target > a[mid]){
		    s = mid+1;
			
		}else if (target< a[mid]) {
			e=mid-1;
		}
		else {
			return mid;
		}
	}
		
		return -1;	
		
	}

}
