package bootcampjava;

public class Shadowing {
	
	static int a=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a();
		a1();
		a2();

	}
	
	static void a() {
		
		a=30;
		System.out.println(a);
	}
    static void a1() {
		
//		a=40;
		System.out.println(a);
	}

    static void a2() {
	
    //	a=30;
	System.out.println(a);
  }

}
