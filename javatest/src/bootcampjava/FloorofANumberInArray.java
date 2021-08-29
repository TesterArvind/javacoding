package bootcampjava;

public class FloorofANumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] b = {2,5,6,8,90,901};
		int tar = 36;
		System.out.println(Ceilin(b,tar));

	}
	
	static int Ceilin(int[] a, int target) {
		int s=0;
		int e=a.length-1;
		
		while(s <= e) {
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
		
		return e;	
		
	}

}
