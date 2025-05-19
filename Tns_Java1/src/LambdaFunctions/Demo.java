package LambdaFunctions;

public class Demo {

	public static void main(String[] args) {

		A obj = (a) -> // -> is the lambda expression used to replace the annonymous function , we can remove the '{}' when we had single method.
			{
				System.out.println("This the value of a : "+a);
			}
		;
		obj.show(3);
		
	}

}

@FunctionalInterface
interface A {
	
	void show(int i);
}