package bootcampjava;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		String fruits = input.next();
		
		switch (fruits) {
		
		case "mango":{
			System.out.println("king of fruits");
			break;
		}
		case "apple":{
			System.out.println("healthy fruit");
			break;
		}
		case "orange":{
			System.out.println("citrus fruit");
			break;
		}
		
		
		}	

	}

}
