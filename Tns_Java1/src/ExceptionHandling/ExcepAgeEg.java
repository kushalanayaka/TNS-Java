package ExceptionHandling;

public class ExcepAgeEg {

	public static void main(String[] args) {

		Age a = new Age();
		a.vote(21);
		
	}

}
class Age{
	
	public void vote(int age) {
		
		try {
		if(age < 18) {
			
			throw new ArithmeticException("Access denide because of age  limit");
		}
		else{
			
			System.out.println("You eligible to vote!");
		}
		}
		catch(ArithmeticException e) {
			
			System.out.println(e);
		}
	}
}