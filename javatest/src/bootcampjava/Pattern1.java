package bootcampjava;

public class Pattern1 {

	public static void main(String[] args) {
		
		int n=5;
		
		for (int i=1; i< 2*n; i++) {
			int c=0;
			if(i>n) {
				c=2*n-i;
				
			}else {
				c=i;
			}
			
			for(int j=1; j<=c; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
