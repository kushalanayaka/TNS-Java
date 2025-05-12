package InterfaceKeyword;

// class -> class => extends
// class -> interface => implements
// interface -> interface => extends

public class MultipleInterface {

	public static void main(String[] args) {
     Movie mov;
     mov = new Good();
     mov.revive();
     Good good  = new Good();
     good.top();
     
	}

}

interface Movie{
	void revive();
}

class Good implements Movie{
	
	public void revive() {
		System.out.println("Thsi Good revive");
	}
	public void top() {
		System.out.println("He is top hero");
	}
}