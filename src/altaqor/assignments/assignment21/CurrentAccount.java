package altaqor.assignments.assignment21;

public class CurrentAccount implements BankAccount{
	
	private double balance;
	private double intRate;
	
	//Create constructor of class CurrentAccount
	public CurrentAccount(double openingBalance,double intRate) {
		this.balance= openingBalance;
		this.intRate= intRate;
	}

	
	public void deposit(double amount) {
		System.out.println("Opening Balance: "+ balance+ "\n");
		balance= balance+ amount;
		System.out.println("Deposited Amount is: "+ amount);
		System.out.println("Your new Balance is: "+balance);
	}

	
	public void withdrawl(double amount) {
		
		if (balance>=amount) {
			balance=balance-amount;
			System.out.println("Withdraw amount:" + amount);
			System.out.println("Your Remaining Balnce: "+ balance);
		}
		else {
			System.out.println("Transaction Failed due to Insufficient funds.\n Your Balance is: " + balance);
			
		}
		
	}

	public double getBalance() {
		
		return balance;
	}

		public double calculateInterest() {
			double interest= (balance*intRate)/100;
			
			balance = balance + interest;
			
			return interest;
			
		}
			
}
