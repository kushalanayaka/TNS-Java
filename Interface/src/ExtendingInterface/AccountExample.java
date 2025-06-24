package ExtendingInterface;


interface AccountHolder{
	
	void withdraw();
	void deposit();
	void loan();
	void accountStatus();
	
}

abstract class Demo1 implements AccountHolder{
	
	public void withdraw() {
		System.out.println("The withdraw amount is : "+100);
	}
}

abstract class Demo2 extends Demo1{
	
	public void deposit() {
		System.out.println("The deposit amount is : "+50);
	}
}

 class Demo3 extends Demo2{
	
	public void loan() {
		System.out.println("Loan granted");
	}
	
	public void accountStatus() {
		System.out.println("Account is active");
	}
}
public class AccountExample {


	public static void main(String[] args) {

		
		Demo3 de = new Demo3();
		de.withdraw();
		de.deposit();
		de.loan();
		de.accountStatus();
		
		}

}
