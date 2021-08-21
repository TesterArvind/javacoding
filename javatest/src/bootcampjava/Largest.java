package bootcampjava;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int a= in.nextInt();
		int b= in.nextInt();
		int c= in.nextInt();
		
		int max=a;
		if (b>max) {
			max=b;
		}
		if(c>max) {
			max=c;
		}
		System.out.println(max);
		
		int num1 = Math.max(123, 23);
		System.out.println(num1);

	}

}
