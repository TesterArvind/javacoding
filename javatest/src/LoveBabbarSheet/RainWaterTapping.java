package LoveBabbarSheet;

public class RainWaterTapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a = {3,0,0,2,0,4};
		int n= a.length;
		int ans = 0;
		
		int[] l = new int[n];
		int[] r = new int[n];
		
		l[0] = a[0];
		for(int i=1; i<n; i++) {
			l[i] = Math.max(l[i-1], a[i]);
			
		}
		r[n-1] = a[n-1];
		for(int i=n-2; n>=0; i--) {
			
			r[i] = Math.max(r[i+1], a[i]);
		}
		
		for(int i=0; i<n; i++) {
			ans+= (Math.min(l[i], r[i]))-a[i];
		}
		
		System.out.println(ans);

	}

}
