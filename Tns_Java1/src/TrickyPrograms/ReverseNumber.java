package TrickyPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
          
		int num = 12347;
		int  reverse = 0;
		
		while(num != 0 ) {
			
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num /= 10;	
		}
		
		System.out.println("The reverse order is " + reverse);
		
	}

}


