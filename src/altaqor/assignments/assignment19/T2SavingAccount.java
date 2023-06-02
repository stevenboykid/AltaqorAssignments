 package altaqor.assignments.assignment19;

public class T2SavingAccount extends T2BankAccount{
		
	double balance=30000;
		
		
		
		//method for initial balance
		public double getBalance() {
			return balance;
			
		}
		//method for deposit amount
		public void deposit(double dAmount) {
			balance=balance+dAmount;
			System.out.println("Diposited amount:" + dAmount);
			System.out.println("Your Balance is: " + balance);
		}
		//method for withdrawal
		public void withdrawl(double wAmount) {
			
			if (balance>=wAmount) {
				balance= balance-wAmount;
				System.out.println("Withdraw amount:" + wAmount);
				System.out.println("Your Remaining Balnce: "+ balance);
			}
			else {
				System.out.println("Transaction Failed due to Insufficient funds.\n Your Balance is: " + balance);
				
			}
				
		}
		
	 public void CalcualteInterest(double interest,double time) {
		 interest= (balance*time*interest)/100;
		 balance = balance + interest;
		 
		 
		 System.out.println("Total Interest Amount is: "+ interest);
		 //System.out.println("Your New Balnce is: " + balance);	 
		 
		 //this.balance=balance;
	 }
	 public static void main(String[] args) {
		T2SavingAccount saving =new T2SavingAccount();
		//calling getBalnce method
		double initial=saving.getBalance(  );
		System.out.println("Your Opening Balnce: "+initial);
		
		saving.deposit(75000);//Calling deposit Method.
		saving.withdrawl(5000);//calling withdrawal Method
		saving.CalcualteInterest(11,2);
	}
	
}
