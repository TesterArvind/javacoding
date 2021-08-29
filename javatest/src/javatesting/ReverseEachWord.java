package javatesting;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String sen = "i am the best";
		
		String[] s = sen.split("\\s");
		
		String rev = "";
		
		for (int i = s.length-1; i>=0; i--) {
			rev += s[i] + " ";
		}
		
		System.out.println(rev);

	}

}
