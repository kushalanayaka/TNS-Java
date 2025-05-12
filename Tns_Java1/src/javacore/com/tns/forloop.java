package javacore.com.tns;

public class forloop {
	public static void main(String args[]) {
		
		for(int i=0; i<=5; i++) {
			if(i==3)
				continue;
			if(i==4)
				break;
			System.out.println("Count:" +i);
		}
	}

}
