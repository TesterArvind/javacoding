package Level1Array;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {0,1,2,3,0,9};
		int t[]= new int[a.length];
		int j=0;
		for (int i=0; i<a.length; i++) {
			
			if(a[i]!=0) {
				t[j++]=a[i];
			}
		}
		while(j<a.length) {
			t[j++]=0;
		}	
		
       for(int c:t) {
    	   System.out.println(c);
       }
	}

}
