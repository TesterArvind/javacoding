package AshokITDSA;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=4;
		
		for(int i=1; i<=num; i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print(i);
			}
			
			for(int k =1; k<=i; k++) {
				
				System.out.println(i+num);
			}
			
			System.out.println();
		}
		
	}

}
