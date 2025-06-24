package NewJDK8;

interface Car{
	
	private static void startEngine(){
		System.out.println("Engine Started");
	}
	
	static void drive() {
		startEngine();
		System.out.println("Car is moving on the road.");
		
	}
}
public class PrivateMethod {

	public static void main(String[] args) {
		
		Car.drive();

	}

}
