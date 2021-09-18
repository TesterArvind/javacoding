package bootcampjava;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String n = "kayak";
		
		
		 
		 System.out.println(isPalindrome(n));

	}
	
	public static boolean isPalindrome(String n) {
		
		
		int s= 0;
		 int e =n.length()-1 ;
		 
		 while(s<e) {
			 
			 if(n.charAt(s) != n.charAt(e)) {
				 
				return false;
				
			 }
			 s++;
			 e--;
		 }
		 return true;
		
	}

}
