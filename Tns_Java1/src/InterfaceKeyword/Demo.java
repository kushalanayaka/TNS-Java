package InterfaceKeyword;

public class Demo {

	public static void main(String[] args) {
     
	 Laptop lap = new Laptop();
	 Dekstop desk = new Dekstop();
	 
	 Developer dev = new Developer();
     lap.code();
	}

}

interface Computer{
	void code();
}
class Laptop implements Computer{
	
	public void code() {
		System.out.println("This is Laptop.");
		
	}
}
class Dekstop implements Computer{
	
	public void code() {
		System.out.println("Code, Compile, Run, Faster");
	}
}
class Developer {
	
	public void code() {
		System.out.println("Code, Compile, Run");
	}
}