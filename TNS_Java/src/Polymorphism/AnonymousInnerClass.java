package Polymorphism;

public class AnonymousInnerClass {

	public static void main(String[] args) {
         
	  AA obj = new AA()
	    {
	    	public void Name() { // USing the abstract method with the Inner class , Anonymous Inner class method;
	    		System.out.println("This is name ");
	    	}
	    	
	    	public void Address() {
	    		System.out.println("This is the Address");// We can create multiple method inside the class.
	    	}
	    };
	  obj.Name();
	  obj.Address();
	}

}

abstract class AA {	
	public abstract void Name();
	public abstract void Address();

}

