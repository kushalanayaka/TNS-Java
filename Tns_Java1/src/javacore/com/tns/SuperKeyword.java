package javacore.com.tns;

public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B obj = new B(3);

	}

}

class A{
	
	public A() {
		super();
		System.out.println(" In A");
	}
	public A(int a) {
		super();
		System.out.println("In Int  A");
	}
}
class B extends A {
	public B() {
		super();
		System.out.println(" In B");
	}
	public B(int a) {
		super();
		System.out.println("In Int  B");
	}
}
