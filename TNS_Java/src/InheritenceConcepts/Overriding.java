package InheritenceConcepts;

public class Overriding {

	public static void main(String[] args) {
        
		AvdCal obj = new AvdCal();
		int res =  obj.add(2,4);
		System.out.println(res);	
	}

}

class Cal{
	
	public int add(int a, int b) {
		
		return a + b;
	}
	
}

class AvdCal extends Cal{
        public int add(int a, int b) {
        	return a + b + 1;	
	}

}



