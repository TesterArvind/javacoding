package Recursion;

public class Fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(6));

	}
	
	public static int fib(int n) {
		
		if(n<2) {
			
			return n;
		}
		
		return fib(n-1) + fib(n-2);
	}

}
