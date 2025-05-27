package ExceptionHandling; // throws and throw are different

public class ThrowsKeyword {

	public static void main(String args[]) {
		
		
		A obj = new A();
		try {
			obj.show();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}

class A {
	
	static {
		System.out.println("Class Loaded.");
	}
	
	public void show() throws ClassNotFoundException{
		
		Class.forName("ExceptionHandling.ThrowsKeyword");
	
	}
}