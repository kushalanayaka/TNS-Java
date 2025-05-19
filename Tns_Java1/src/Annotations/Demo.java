package Annotations;
//Anotation is form of Metadata that provides the information about the program but not the part of program itself.
public class Demo {

	public static void main(String[] args) {
		
		B obj = new B();
		obj.showDataInThisClass();

	}

}


class A{
	
	void showDataInThisClass() {
		System.out.println("This is A class");
	}
}
class B extends A{
	
	@Override //This anotation is used to correct error in the program
	void showDataInThisClass() {
		System.out.println("This is B class");
	}
}