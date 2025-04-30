package ArrayConcepts;

public class ArrayObjects {
	
	public static void main(String args[]) {
		 int count = 0;
		 int c =0 ;
		 Vowels vol = new Vowels();
	
		for(int i=0; i<vol.v.length; i++) {
			if(vol.s.toLowerCase().indexOf(vol.v[i]) != -1) {
				count++;
			}
		}
//		System.out.println(count);
		
		
		
		char Name[] = {'a','u','e','i','o'};
		String check = "kkk";
		
		for(char k : Name) {
			if(check.indexOf(k) != -1) {
				c++;
				
			}
		}
		System.out.println(c);
		
	}

}

class Vowels{
	
	char v[] = {'a','e','i','o','u'};
	String s = "Kanneeeeiiada";
}