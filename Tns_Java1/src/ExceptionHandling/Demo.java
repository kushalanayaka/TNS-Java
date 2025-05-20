package ExceptionHandling;

public class Demo { //Exception is from throwable(class) is used handle the errors for user experience

	public static void main(String[] args) {

		int i = 2;
		int j = 0;
		String str = "kushal";
		int arr[] = new int[4];
		
		try { // try can have multiple catch block but try is must be one 
			
			j = 10/i;
			System.out.println(j);
			System.out.println(str.length());
			System.out.println(arr[5]);
			
			
		}
		
		catch(ArithmeticException e) {
			
			System.out.println("Num can't divisile by zero!");
			
		}
        catch(NullPointerException e) {
			
			System.out.println("The String is null");
			
		}
        catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Array index excluded");
			
		}
		catch(Exception e) { // This should always be first. 
			
			System.out.println("Something went wrong" + e);
			
		}
//		System.out.println("Hello");

	}

}
