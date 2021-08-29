package bootcampjava;

public class EvenNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {12,10,39,4543,5};
	
		int count=0;
		
		for(int i=0; i<a.length; i++) {
		int c=0;
		while(a[i]!=0) {
			a[i]/=10;
			c++;
			
		}
		if(c%2==0) {
			count++;
		}
	}
		
		System.out.println(count);
	}

}
