package Oops;

public class DemoAccount {

	public static void main(String[] args) {

		
		Account acc = new Account( 4000, "kushal");
		
		acc.deposit(500);
		acc.withdraw(200);
		
		System.out.println("The balance amount Rs: " + acc.getBalance() + " of the user " + acc.getOwnerName());
		
	}

}

class Account{
	
	private double balance;
	private String ownerName;
	
	
	public Account(double balance, String ownerName) {
		super();
		this.balance = balance;
		this.ownerName = ownerName;
	}

	
	public void deposit(double amount) {
		
		if(amount > 0) {
			balance += amount;
		    System.out.println("amount deposited : "+amount);}
	    else
	    {
		    System.out.println("invalid account owner  ");}
    	
	}
	
	public void withdraw(double amount) {
		
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdraw amount : "+amount  );
		}
		else {
			System.out.println("Insuffisient bank balance");
		}
	}

	public double getBalance() {
		return balance;
	}


	public String getOwnerName() {
		return ownerName;
	}
	
	
	
	
}