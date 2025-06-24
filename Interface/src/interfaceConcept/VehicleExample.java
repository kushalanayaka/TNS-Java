package interfaceConcept;

public class VehicleExample {

	public static void main(String[] args) {

		Bicycle by = new Bicycle();
		System.out.println("-----------BICYCLE--------");
		by.speedUp(90);
		by.gearUp(20);
		by.applyBreak(20);
		by.display();
		
		Bike b = new Bike();
		System.out.println("-----------BIKE--------");
		b.speedUp(90);
		b.gearUp(20);
		b.display();
	}

}


interface Vehicle{
	
	void speedUp(int a);
	void gearUp(int a);
	void applyBreak(int a);
	
}

 class Bicycle implements Vehicle{
	
	int speed;
	int gear;
	
	@Override
	public void speedUp(int inc) {
		speed = speed + inc;
	}
	@Override
	public void gearUp(int inc) {
		gear = gear + inc;
	}
	
	@Override
	public void applyBreak(int dec) {
	
		speed = speed - dec;
	}
	public void display() {
		System.out.println("Speed : "+speed+" Gear : " +gear);
	}
}

 class Bike implements Vehicle{

	int speed;
	int gear;
	@Override
	public void speedUp(int inc) {
		speed = speed + inc;
	}
	@Override
	public void gearUp(int inc) {
		gear = gear + inc;
	}
	@Override
	public void applyBreak(int dec) {
		
		speed = speed - dec;
	}
	
	public void display() {
		System.out.println("Speed : "+speed+" Gear : " +gear);
	}
	
	
}