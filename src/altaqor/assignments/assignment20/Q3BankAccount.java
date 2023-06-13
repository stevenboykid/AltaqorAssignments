 package altaqor.assignments.assignment20;

public class Q3BankAccount {
	 String accountNumber;
	 double balance;
	
//creating Parameterized constructor of BankAccount
	
public Q3BankAccount (String accountNumber,double balance) {
	
		this.accountNumber =accountNumber;
		this.balance=balance;
	
	}
	public void displayInfo(String accountNumber, double balance) {
		
		System.out.println("Account Number is: " + accountNumber);
		System.out.println("Your Balance is: " + balance);
	}
	

}
