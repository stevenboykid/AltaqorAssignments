package altaqor.assignments.assignment20;

public class Q3CurrentAccount extends Q3BankAccount{
	double overLimit;
	
	public Q3CurrentAccount(String accountNumber, double balance, double overLimit) {
		super(accountNumber, balance);
		this.overLimit=overLimit;

	}
	
	public void displayInfo(String accountNumber, double balance) {
		super.displayInfo(accountNumber, balance);
		System.out.println("Your Overlimit is: "+ overLimit);
		
	}
		public static void main(String[] args) {
			//Creating object of BankAccount and calling it.
			Q3BankAccount bankAccount= new Q3BankAccount("r123",5000);
			bankAccount.displayInfo("rp01231", 50000);
			
			//creating object of Saving account and calling it.
			System.out.println("Calling SavingAccount*........");
			Q3SavingAccount savingAccount= new Q3SavingAccount("r12",0,3.5);
			savingAccount.displayInfo("rp01232", 50000);
			
			//creating object of CurrentAccount and calling it.
			System.out.println("Calling CurrentAccount*........");
			Q3CurrentAccount currentAccount = new Q3CurrentAccount("r1",5600,7500);
			currentAccount.displayInfo("rp01233",50000);
			
		}
	
		}
	

