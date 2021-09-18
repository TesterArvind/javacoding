package Level1Array;

public class HappyNumber {
	
	
	public static int isHappyNumber(int num) {
		
		int rem = 0, sum = 0;  
        
        //Calculates the sum of squares of digits  
        while(num > 0){  
            rem = num%10;  
            sum = sum + (rem*rem);  
            num = num/10;  
        }  
        return sum;  
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=82;
		int result = num;
		
		while(result != 1 && result !=4) {
			result=isHappyNumber(result);
			
		}
		
		if(result ==1) {
			System.out.println("is happy number");
		}
		if(result==4) {
			System.out.println("is nothappy number");
		}
		
	}

}
