package Polymorphism;

public class FinalKeyword {

	public static void main(String[] args) {
		
		
		final int  num = 11; // Const - can't be change.
//		System.out.print(num);
		
		//final class 
        Calc obj = new Calc();
        obj.show();
       int res =  obj.add(2, 5);
        
        System.out.println(res);
	}

	
}
final class Calc{
	
	public void show() {
		System.out.println("Its by Kushal");
	}
	
	public int add(int a, int b) {	
		return a + b;
	}
}

class AdvCalc {
   public void show() {
	   System.out.println("It's by Kush");
   }
}