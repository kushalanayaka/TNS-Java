package NewJDK8;


interface StaticInterface{
	
	static void display() {
		System.out.println("The Static method calling by its Interface.");
	}
}
public class StaticMethod {

	public static void main(String[] args) {

		StaticInterface.display();

	}

}
