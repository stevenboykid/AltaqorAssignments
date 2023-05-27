package altaqor.assignments.assignment19;

public class SavingAccount extends BankAccount{
		
		double balance;
		double damount;
		double wamount;
	

	public double getBalance(double balance) {
		System.out.println("Your balnce is: "+balance);
		return balance;
		
	}
	
	public void deposit(double damount) {
		this.damount=damount;
		System.out.println("Diposited Amount is: " +damount);
	}
	
		
	public void withdrawl(double wamount) {
		this.wamount=wamount;
		System.out.println("Withdrawl Amount is :" + wamount);
		
	}
	public static void main(String[] args) {
		SavingAccount saving =new SavingAccount();
		saving.getBalance(125000);
		saving.withdrawl(7000);
		saving.deposit(75000);
	}

	
	
	public double newBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	


	
	

	
	
}
