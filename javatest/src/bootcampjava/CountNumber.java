package bootcampjava;

public class CountNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234534;
		int count =0;
		while(num>0) {
			
			int rem=num%10;
			if(rem==3) {
				count++;
			}
			num/=10;
		}
      System.out.println(count);
	}

}
