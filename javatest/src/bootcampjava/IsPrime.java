package bootcampjava;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		
		System.out.println(isPrime(num));

	}
	
	static boolean isPrime(int n) {
		
		if(n<1) {
			return false;
		}
		
		for(int i=2; i<=n/2; i++) {
			
			if(n%i==0) {
			return false;
			}
		}
		
		return true;
	}
	

}
