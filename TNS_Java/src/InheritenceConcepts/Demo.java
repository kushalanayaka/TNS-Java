package InheritenceConcepts;

public class Demo {
	public static void main(String args[]) {
		
		
		ScientificCalc obj = new ScientificCalc();
		int r1 = obj.add(4, 9);
		int r2 = obj.sub(10, 9);
		int r3 = obj.mul(4, 5);
		int r4 = obj.div(18, 9);
		double r5 = obj.power(5, 2);
		
		System.out.println(r1+" | "+r2+" | "+r3+" | "+r4+" | "+r5);

	}

}
