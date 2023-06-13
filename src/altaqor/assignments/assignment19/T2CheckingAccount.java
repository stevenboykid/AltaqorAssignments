package altaqor.assignments.assignment19;

public class T2CheckingAccount extends T2SavingAccount {
	
	public void DeductFees() {
		
		double balance;
		balance=super.getBalance();
		double serviceFee = 0.02;
				
		serviceFee=(serviceFee*getBalance());
		super.balance=balance-serviceFee;
		System.out.println("Your Yearly Service fee @ 2%: "+ serviceFee);
		System.out.println("Your Final Balance: "+ super.balance);
		
	}
	
	
		public static void main(String[] args) {
			T2CheckingAccount service =new T2CheckingAccount();
			//calling getBalnce method
			double initial=service.getBalance(  );
			System.out.println("Your Opening Balnce: "+initial);
			
			service.deposit(75000);//Calling deposit Method.
			service.withdrawl(5000);//calling withdrawal Method
			service.CalcualteInterest(11,2);
			
		
		service.DeductFees();
		
		
	}
}
