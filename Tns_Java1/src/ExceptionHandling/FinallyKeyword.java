package ExceptionHandling;

public class FinallyKeyword {

	public static void main(String args[]) {
		
		int i = 3 ;
		 int j = 0;
		 
		 try {
			 
			 j = 15 / i;
		 }
		 catch(ArithmeticException e) {
			 
			 System.out.println("Something went wrong!");
		 }
		 
		 finally { // Finally - do irrespect to the exception and it used close the exception 
			 System.out.println("Bye");
		 }
	}
	
}
