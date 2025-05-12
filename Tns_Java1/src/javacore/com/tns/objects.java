package javacore.com.tns;

public class objects {
	
	static class Car{
		
		String name;
		String model;
		int no;
		
		void dispaly() {
			System.out.println("Name: "+name+". Model: "+model+". Number : "+no);
		}
	}
	public static void main(String args[]) {
		
		Car car = new Car();
		
		car.name = "Lamborgini";
		car.model = "L2c";
		car.no = 1234;
		
		car.dispaly();
	}

}
