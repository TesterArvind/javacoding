package LoveBabbarSheet;

public class CommonElementsInThreeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {3,5,6,8};
		int[] b = {2,3,5,9,10};
		int[] c = {1,2,3,4,5};
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<a.length && j<b.length && k<c.length) {
			
			if(a[i] == b[j] && b[j]==c[k]) {
				
				System.out.println(a[i]);
				i++;
				j++;
				k++;
			}
			
			if(a[i]<b[j]) {
				i++;
			} else if (b[j] <c[k]) {
				j++;
			}else {
				k++;
			}
			
		}

	}

}
