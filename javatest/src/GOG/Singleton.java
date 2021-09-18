package GOG;

public class Singleton {
	
	static Singleton obj = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		
		
		return obj;
	}

	public static void main(String[] args) {
		
		Singleton obj = Singleton.getInstance();
		

	}

}
