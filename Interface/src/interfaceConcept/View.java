package interfaceConcept;

public class View {
	
	public static void main(String args[]) {
		
		B1 b = new B1();
		b.display();
		System.out.println(b.val);
		
	}

}

interface A1{
	
	final int val = 120;
	
	void display();
}


class B1 implements A1{
	
	public void display() {
		System.out.println("Hello world");
		
	}
}