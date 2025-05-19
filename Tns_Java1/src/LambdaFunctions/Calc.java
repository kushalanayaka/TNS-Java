package LambdaFunctions;

public class Calc {

	public static void main(String[] args) {

		Cal obj = (i, j) ->   i + j;

		System.out.println("res: "+obj.add(6, 8));
	}

}


interface Cal{
	
	int add(int i , int j);
}