package Polymorphism;

public class WrapperCalss {

	public static void main(String[] args) {
		
		int num = 12;
		Integer num1 = num; //Autoboxing - When you store the primitive type integer automatically.
		
		Integer num2 = num1; // Auto unboxing - when you `take out the integer from the object
		String a = "123";
		
		Integer num3 = Integer.parseInt(a); //parseInt - used to convert the value from string to Integer.
		System.out.println(num2*2);

	}

}

