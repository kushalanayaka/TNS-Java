package javacore.com.tns;

public class Staticconcets {
	
	public static void main(String args[]) {
		
		Library lib = new Library(1);
		Library lib1 = new Library(2);
		
//		System.out.println()
		
		lib.display();
		lib1.display();
		int res = Addition.addi(23);
		System.out.println("Additio of three numbers are: "+ res);
		
		Test.show();
		
	}
	
	
}
class Library{
	
	int Id ;
	static String addr = "Govt library";
	
	Library(int i){
		 Id = i;
//		 addr = ad;
	}
	public void display() {
//		System.out.println("ID: "+Id+" ADDRESS: "+Library.addr);
		
	}
}

class Addition{
	static int addi(int a) {
		
		return a + a + a;
	}
}

class Test{
	
	static int num ;
	static {
		System.out.println("This the first statement to be execute.");
		num = 10;
		}
	
	static void show() {
		System.out.println("Number is : "+num);
	}
}
