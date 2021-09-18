package BootCampAssignment2;

public class Fibonacci {

	public static void main(String[] args) {
		
		
		int n1=0;
		int n2 =1;
		int num=10;
		
		System.out.print(n1 +" "+ n2);
		
		for(int i = 1; i<10;i++) {
			
			int sum = n1+n2;
			
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
			
		}

	}

}
