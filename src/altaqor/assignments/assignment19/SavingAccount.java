package altaqor.assignments.assignment19;

public class SavingAccount extends BankAccount{
		
		
	

	public double getBalance(double balance) {
		System.out.println("Your balnce is: "+balance);
		return balance;
		
	}
	
	public void deposit(double damount) {
		System.out.println("Diposited Amount is: " +damount);
	}
	
		
	public void withdrawl(double wamount) {
		System.out.println("Withdrawl Amount is :" + wamount);
		
	}
	public static void main(String[] args) {
		SavingAccount saving =new SavingAccount();
		saving.getBalance(7000);
		saving.withdrawl(7000);
		saving.deposit(75000);
	}

	
	public double getBalance() {
		//double =wamount;
		//double  amount=wamount;
		//double  = 0;
		//System.out.println("Your New Balance is:" + i + amount);
		return 0;
	}

	

	


	
	

	
	
}
