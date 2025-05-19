package Annotations;

public class InterfaceAnno {

	public static void main(String[] args) {

		You obj = new You(){ // we using the annonymous function here 
			
			public void show() {
				System.out.println("This is Functional interface Annotation ");
			}
	     };
    	obj.show();

}
	
}	
@FunctionalInterface // This Annotation allows only one abstract method 
interface You{ 
	
	void show();
}