package CoreJava;

public class Override {
	
	public static void main(String args[]) {
		
		AvdCal cat = new AvdCal();
		int res = cat.Add(3,4);
		
		System.out.println(res);
	}

}

class Cal{
	
	public int Add(int a , int b) {
		return a + b;
	}
}
class AvdCal extends Cal{
	public int Add(int a, int b) {
		return a+ b;
	}
}