package multipleInterface;

public class Calculation {

	public static void main(String[] args) {

		Cal cal = new Cal();
		
		System.out.println("Addition of two numbers  is : "+cal.add(2, 5));
		System.out.println("Substraction of two numbers  is : "+cal.sub(2, 5));
		

	}

}


interface Addition{
	
	int add(int a , int b);
	
}

interface Substraction{
	
	int sub(int a, int b);
}

class Cal implements Addition, Substraction {
	
	public int add(int a, int b) {
		return a + b;
	}
	public int sub(int a, int b) {
		return a - b;
	}
}