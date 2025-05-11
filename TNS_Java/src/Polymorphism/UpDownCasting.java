package Polymorphism;

public class UpDownCasting {

	public static void main(String[] args) {
		
		B b = new B();
		A a = b;	
//		a.show();
		
		A obj = new B();
		
		B obj1 = (B) obj;
		obj1.show();
	}

}


class A{
	
	public void show() {
		System.out.println("In show A");
	}
}

class B extends A{
	
	public void show() {
		System.out.println("In show B");
	}
}
