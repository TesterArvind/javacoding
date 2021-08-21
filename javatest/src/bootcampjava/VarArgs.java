package bootcampjava;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fun(1,2,3,4,234);
		multiple(1,3,"a","b","v");

	}
	
	static void fun(int ...v) {
		
		System.out.println(Arrays.toString(v));
		
	}
	
	static void multiple(int a, int b, String ...v) {
		
		
		
	}

}
