package ExceptionHandling;

public class ThrowKeyword { // User can defined the output , even if the output is not the actual output.

	public static void main(String[] args) {
      
		int i = 23;
		int j = 0;
		
		try {
			j = 20/i;
			if(j == 0) {
				throw new ArithmeticException("Zero is not the corrcet answer");
			}
		}
		catch(ArithmeticException e) {
			j = 20/2;
			System.out.println("something went wrong."+e);
		}
		
		System.out.println(j);
	}

}
