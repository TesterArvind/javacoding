package Level1Array;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= "love";
		String b = "you";
//		a="aaaa";
		a=a+b;
		
//		loveyou
		System.out.println(a);
		
		b = a.substring(0, a.length()-b.length());
        a = a.substring(b.length());
        
        System.out.println(a);
        System.out.println(b);
	}

}
