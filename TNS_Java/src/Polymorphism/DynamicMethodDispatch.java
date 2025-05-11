package Polymorphism;

public class DynamicMethodDispatch { //We can use the same parent class for each child class , No need to create new for the child class . 

	public static void main(String[] args) {
		
		Computer obj = new Computer();
		obj.show();

		obj = new Laptop();
		obj.show();
		
	    obj = new Phone();
		obj.show();
		
	}

}


