package AccessModifier;

public class A {
	
	protected int num = 21;
	
	public void show() {
		
	}
}

class X extends A
{
public void abc() {
	
	X a = new X();
	System.out.println(a.num);
} 
}