package CoreJava;

public class PrimeNum {

	public static void main(String[] args) {	
      
		
		int num = 9;
		
		if(num <= 1) {
			System.out.println("Please enter correct number! ");
			
		}
		else {
			for(int i=2; i<=Math.sqrt(num); i++) {
				if(num % i == 0) {
					System.out.println(num +" is not a prime");
				    return ;
				}
			}
			System.out.println(num+ " is a prime");
		}	
	
	}
}
	


