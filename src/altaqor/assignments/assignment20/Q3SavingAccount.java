package altaqor.assignments.assignment20;

public class Q3SavingAccount extends Q3BankAccount {
	//adding instance variable interestRate
	double intRate;
	
//Creating constructor of saving account with supper Key to achieve the value of instance variable from its parent class.
	public Q3SavingAccount(String accountNumber, double balance, double intRate) {
		
		super(accountNumber, balance);
		this.intRate=intRate;
	}
		
	public void displayInfo(String accountNumber, double balance) {
		super.displayInfo(accountNumber, balance);
		System.out.println("Rate of interest: "+ intRate);
	}
		
}
	
	