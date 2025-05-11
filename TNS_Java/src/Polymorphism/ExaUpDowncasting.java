package Polymorphism;

public class ExaUpDowncasting {

	public static void main(String[] args) {
		
//		Upcasting 
		Dog dog = new Dog();
		Animal animal = dog;
		animal.sound();
		
//		DownCasting
		Animal obj = new Dog();
		
		Dog obj1 = (Dog) obj;
		obj1.sound();

	}

}


class Animal{
	
	public void sound() {
		System.out.println("Sound of the Animals");
	}
}
class Dog extends Animal{
	
	public void sound() {
		System.out.println("Dog bow bow");
	}
}