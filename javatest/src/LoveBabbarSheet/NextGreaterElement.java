package LoveBabbarSheet;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {2,4,3,6};
		
		for(int i=0; i<a.length; i++) {
			
			for (int j=i+1; j<a.length; j++) {
				
				if(a[j]>a[i]) {
					System.out.println(a[i]+ " - "+a[j]);
					break;
				}else {
					System.out.println(a[i] +" - " + null);
				}
			}
		}

	}

}
