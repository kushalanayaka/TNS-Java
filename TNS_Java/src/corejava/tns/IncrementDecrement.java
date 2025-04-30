package corejava.tns;

public class IncrementDecrement {
	
	public static void main (String args[]) {
		
    int v = 10;
    int postInc = v++;
    System.out.println(postInc);
    System.out.println(v + "\n");
    
    int y = 10;
    int preInc = ++y;
    System.out.println(preInc);
    System.out.println(y);

	}

}
