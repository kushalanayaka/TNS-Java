package ExceptionHandling;

public class CustomException {

	public static void main(String[] args) {
     
		
		int i = 2;
		int j = 0;
		
		try {
			
			j = 18 / i;
			
			throw new KushalException("Zero is not a correct answer");
		}
		catch(KushalException e) {
			
			System.out.println("Something went wrong"+ e);
		}
	}

}


class KushalException extends RuntimeException{ //for creating our own exception we have to create the class , contractor and method. 
	
	public KushalException(String string) {
		
		super(string);
	}
}