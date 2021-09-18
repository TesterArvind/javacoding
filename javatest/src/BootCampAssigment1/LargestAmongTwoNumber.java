package BootCampAssigment1;

import java.util.Scanner;

public class LargestAmongTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if(n1>n2) {
			System.out.println("largest is n1 " + n1);
		}else {
			System.out.println("largest is n2"
					 + n2);
		}

	}

}
