package Polymorphism;

public class Computer {
    
	public void show() {
		System.out.println("This is Computer.");
	}
}
class Laptop extends Computer{
	
	public void show() {
		System.out.println("This is Laptop.");
	}
}

class Phone extends Computer{
	
	public void show() {
		System.out.println("This is Phone.");
	}
}