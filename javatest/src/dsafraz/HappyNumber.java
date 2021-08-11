package dsafraz;

import java.util.HashSet;

public class HappyNumber {
	
	
	
	public static boolean iHappyNumber(int n) {
		
		
		HashSet<Integer> seen = new HashSet<>();
		
		while(n!=1) {
			
			int sum=0;
			int current = n;
			
			while (current!= 0) {
				
			sum+= (current%10)*(current%10);
			current/=10;
		    }
			
			if (seen.contains(sum)) 
			{ return false;
			}
			
			seen.add(sum);
			n =sum;
		}
		
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(iHappyNumber(82));
	}

}
