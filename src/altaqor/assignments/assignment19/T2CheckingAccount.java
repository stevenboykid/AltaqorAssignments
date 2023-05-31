package altaqor.assignments.assignment19;

public class T2CheckingAccount extends T2BankAccount {
	public void DeductFees() {
		
		double balance;
		balance=getBalance();
		double fee = 0.02;
		
		fee=(fee*getBalance());
		balance=getBalance()-fee;
		System.out.println("Your Yearly Service fee @ 2%: "+ fee);
		System.out.println("Your Net remaining Balance: " + balance);
	}
	
	
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawl(double amount) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		T2CheckingAccount service =new T2CheckingAccount();
		service.DeductFees();
		//saving.DeductFees();
		
	}
}
