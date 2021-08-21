package bootcampjava;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isArmstrongNumber(153));

	}
	
	static boolean isArmstrongNumber(int n) {
		int temp, res = 0;
		int n1 =n;
		while(n!=0) {
			
			temp=n%10;
			res+= (temp*temp*temp);
			n/= 10;	
		}
		if(res == n1) {
			return true;
		}
		
	
	
		return false;
	}

}
