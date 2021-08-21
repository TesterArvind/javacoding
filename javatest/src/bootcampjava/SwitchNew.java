package bootcampjava;

import java.util.Scanner;

public class SwitchNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int day = s.nextInt();
		
		switch(day) {
		
		case 1,2,3,4,5 -> System.out.println("weekday");
		case 6,7 -> System.out.println("weekend");
		
		
		}

	}

}
