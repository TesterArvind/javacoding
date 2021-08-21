package dsafraz;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array= {0,1,2,3,0,6,5,0};
		int index=0;
		for (int i=0; i<array.length; i++) {
			
			if(array[i] !=0) {
				array[index++]=array[i];
			}
		}
      
		for(int i=index; i< array.length; i++) {
			array[index++]=0;
		}
		
		for (int c: array) {
			System.out.println(c);
		}
	}

}
