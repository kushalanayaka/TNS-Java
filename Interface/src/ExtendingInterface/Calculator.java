package ExtendingInterface;


interface AddSub{
	
	int add(int a, int b);
	int sub(int a, int b);
	
}

interface multi extends AddSub{
	
	int mul(int a, int b);
}


public class Calculator implements multi  {
	
	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a -  b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {
		
		
		Calculator cal = new Calculator();
		int add = cal.add(20, 10);
		int sub = cal.sub(30, 10);
		int mul = cal.mul(add, sub);
		
		System.out.println(" Addition: "+add+"\n Substraction : "+sub+"\n Multiplication : "+mul);
		
		

	}

}
