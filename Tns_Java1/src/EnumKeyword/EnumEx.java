package EnumKeyword;

public class EnumEx {

	public static void main(String[] args) {
		
		TrafficRules tr = TrafficRules.Go;
		
		switch(tr) {
		case Stop:
			System.out.println("Stop the vehicles");
            break;
		case Go:
			System.out.println("Move the vehicles");
            break;       
		case Hold:
			System.out.println("Wait for few minutes");
            break;
          		}

	}

}


enum TrafficRules{
	Stop, Go, Hold;
}