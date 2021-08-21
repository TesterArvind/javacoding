package bootcampjava;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		int day = s.nextInt();
		
		switch (day) {
		
		case 1:{
			System.out.println("mon");
			break;
		}
		
		case 2:{
			System.out.println("tue");
			break;
		}
		
		case 3:{
			System.out.println("wed");
			break;
		}
		
		case 4:{
			System.out.println("thu");
			break;
		}
		
		case 5:{
			System.out.println("fri");
			break;
		}
		
		case 6:{
			System.out.println("sat");
			break;
		}
		
		
		}

	}

}
