package bootcampjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		for (int i=0; i<3; i++) {
			
			list.add(new ArrayList<Integer>());
		}
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<2; j++) {
				
				list.get(i).add(sc.nextInt());
			}
		}
		
		System.out.println(list);
		

	}

}
