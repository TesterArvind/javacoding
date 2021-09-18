package LoveBabbarSheet;

public class CompressString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aaabbbaaacc";
		char[] c =s.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		
		char current =c[0];
		int count =1;
		
		for(int i=1; i<c.length; i++) {
			
			if(current == c[i]) {
				count++;
				
			}else {
				
				sb.append(current).append(count);
				current=c[i];
				count=1;
			}
			
		}
		sb.append(current).append(count);
		
     System.out.println(sb.toString());
     
	}

}
