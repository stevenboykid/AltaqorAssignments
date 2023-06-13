package altaqor.assignments.assignment21;

public class MainMethodForAllBankAccounts {
 
	public static void main(String[] args) {
		//Creating object of SavingAccount Class
		SavingAccount saving =new SavingAccount(33000,2.1);	
		
		//calling deposit Method
		double diposit=5000;
		saving.deposit(diposit);
		
		//calling withdrawl() method
		saving.withdrawl(30000);
		//calling calculateInterest() method
		double rateOfInterest=saving.calculateInterest();
		System.out.println("Total Interest @2.1% is: "+rateOfInterest );
		//calling getBalnce() method
		double currentBalance=saving.getBalance();
		System.out.println("Your Current Balance is: "+ currentBalance);
		
		//Creating object of CurrentAccount Class and calling all the methods
		System.out.println("\n ***** Calling CurrentAccount *****");
		CurrentAccount current=new CurrentAccount(5000,0);
		
		current.deposit(25000);
		current.withdrawl(35000);
		
		double interest=current.calculateInterest();
		System.out.println("Interest Amount @0% is: "+ interest);
		
		double balance = current.getBalance();
		System.out.println("Current Balnce is: "+ balance);
		
		
		  
		 
	}
}
