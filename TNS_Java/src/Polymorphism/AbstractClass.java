package Polymorphism;

public class AbstractClass {

	public static void main(String[] args) {
		Car obj = new AudiQ15();
		obj.drive();
		obj.playMusic();
		obj.Drift();

	}

}

abstract class Car{
	
	public abstract void drive();
	public abstract void Drift();

	public void playMusic() {
		
		System.out.println("Playing music...");
	}
}

abstract class AudiQ5 extends Car{
	
	public void drive() {
		System.out.println("Driving the Audi car..");
	}
}

class AudiQ15 extends AudiQ5{
	
	public void Drift() {
		System.out.println("THe Car is Drifting...");
	}
	
}