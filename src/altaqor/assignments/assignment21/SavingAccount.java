package altaqor.assignments.assignment21;

public class SavingAccount implements BankAccount{
	private double balance;
	private double intRate;
	
	//Create constructor of class Q3SavingAccount
	public SavingAccount(double openingBalance,double intRate) {
		this.balance= openingBalance;
		this.intRate= intRate;
	}
	
	
	//method for Deposit
	public void deposit(double amount) {
		System.out.println("Your Opening Balance is: "+ balance+ "\n");
		balance=balance+amount;
		
		System.out.println("Your Diposited Amount: "+ amount);
		System.out.println("Your New Balance is: " + balance);
		
	}
	

		//Method for Withdrawal
	public void withdrawl(double amount) {
		//balance=balance-amount;
		
		if (balance>=amount) {
			balance= balance-amount;
			System.out.println("Withdraw amount:" + amount);
			System.out.println("Your Remaining Balnce: "+ balance);
		}
		else {
			System.out.println("Transaction Failed due to Insufficient funds.\n Your Balance is: " + balance);
			
		}
		
	}

	 //Method for calculating interest rate for 1 year @Some% 
	public double calculateInterest() {
		
		double interest= (balance*intRate)/100;
		balance = balance + interest;
		return interest;
		
	}
	
	//Method for Getting Current Balance
		public double getBalance() {
			
			return balance ;
		}

	
}
