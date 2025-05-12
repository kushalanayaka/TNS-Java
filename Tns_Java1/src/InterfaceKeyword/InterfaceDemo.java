package InterfaceKeyword;
// Interface allow us to perform multiple Interface , but not by using the classes.

public class InterfaceDemo { // Interface is not a Class in java, includes Abstract method inside it and its same as static keyword
	
	public static void main(String args[]) {
	
	First obj;
//	obj = new First(); We not able to crate the obj for the interface class.
	obj = new Second();
	obj.show();
	obj.config();
	
	System.out.println(First.age +" | "+ First.name ); // Here we see the method like static method ,
	//we are directly calling the variable from the interface class.

	}
}

interface First{
	
	public void show();
	public void config();
	
	int age = 23;
	String name = "Kushal";
	
	
}

class Second implements First{
	
	public void show() {
		System.out.println("This is show");
	}
	
	public void config() {
		System.out.println("This is Config");
	}
}