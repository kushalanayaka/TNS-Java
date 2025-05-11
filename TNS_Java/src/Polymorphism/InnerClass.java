package Polymorphism;

public class InnerClass {

	public static void main(String[] args) {
		
		First obj = new First();
		obj.show();
		
		First.Second obj1 = obj.new Second();
		obj1.NewShow();

	}

}

class First{
	
	int age;
	
	public void show() {
		System.out.println("This First Class.");
	}
	
	class Second{ // This the inner class
		
		public void NewShow() {
			
		System.out.println("This Second class inside the First.");
	
		}
	}
}
