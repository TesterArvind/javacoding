package bootcampjava;

public class MaxWealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a= {
				{1,2,34},
				{5,6,7},
				{10,11,20,1000}
				};
		
		System.out.println(maxWealth(a));

	}
	
	static int maxWealth(int[][] ar) {
		int max=0;
		for(int row=0; row<ar.length; row++) {
			int sum=0; 
		   for (int col=0; col<ar[row].length; col++) {
			   
			   sum +=ar[row][col];
			   
		   }
		   if (sum>max) {
			   max= sum;
		   }
		}
		
		
		
		return max;
	}

}
