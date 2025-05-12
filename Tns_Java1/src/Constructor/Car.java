package Constructor;

public class Car {

	public static void main(String[] args) {
		
		Cars cars = new Cars();
		Cars cars1 = new Cars(23, "Benz");
		
		cars.display();
		cars1.display();

//		System.out.println("ID: "+car.Id +" NAME: "+ car.name);
	}

}

class Cars{
	
	int Id;
	String name;
	
	Cars(){ //Default constructor
		System.out.println("this is constructor");
		Id =12;
		name = "Toyoto";
	}
	
	public Cars(int i, String n) {//Parameterized constructor
		
		 Id = i;
		 name = n;
	}

	public void display() {
		
		System.out.println("ID: "+Id+" NAME: "+name);  //Constructor overloading

		
	}
	
	
}
