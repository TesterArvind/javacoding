package Level1Array;

public class OccurenceOfElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,1,4,5,1,8,91,1,1,1,1,1,1,2};
		
		int l= 0;
		int h= a.length-1;
		int count=0;
		
		while(l<=h) {
			
			if(a[l] ==2) {
				count++;
				l++;
			}else {
				l++;
			}
			
			
			if(a[h] ==2) {
				count++;
				h--;
			}else {
				h--;
			}
			
		}
		System.out.println(count);

	}

}
