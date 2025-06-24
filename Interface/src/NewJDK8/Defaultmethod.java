package NewJDK8;
interface Test {
	 
	final int val = 100;
	
	
	default void display() {
		System.out.println("Hello");
	}
}

public class Defaultmethod implements Test{
	public static void main(String[] args) {

		Defaultmethod obj = new Defaultmethod();
		obj.display();
		
	}

}

