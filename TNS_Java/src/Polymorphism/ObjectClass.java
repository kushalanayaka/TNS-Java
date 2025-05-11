package Polymorphism;

import java.util.Objects;

public class ObjectClass {

	public static void main(String[] args) {
		
		Laptop1 obj = new Laptop1();
		obj.model = "Dell G15";
		obj.price = 1500;
		
		Laptop1 obj1 = new Laptop1();
		obj1.model = "Dell G15";
		obj1.price = 1500;
		
		
		System.out.println(obj); // every time when you call the obj it automaticaly convert it into toString
//
		
		boolean res = obj.equals(obj1); //when you comparing with equals , It should both the obj have same Hashcode.
		System.out.println(res);

	}

}

class Laptop1{
	
	String model;
	int price;
	@Override
	public String toString() {
		return "Laptop1 [model=" + model + ", price=" + price + "]";
	}
	@Override
	public int hashCode() { //Creating the hashcode and equals method using the IDE sources
		return Objects.hash(model, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop1 other = (Laptop1) obj;
		return Objects.equals(model, other.model) && price == other.price;
	}
	
//	public String toString() { // Its directly calling the toString method
//		
//		return "Hey Kushal";
//	}
//	
//	public boolean equals(Laptop1 that) { //checking for the equals
//		
//		return this.model.equals(that.model) && this.price == that.price;
//	}
	
	
}