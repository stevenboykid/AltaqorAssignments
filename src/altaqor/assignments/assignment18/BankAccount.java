package altaqor.assignments.assignment18;

public class BankAccount {
 
	//private String accountNumber;
	private double balance;
	private String passWord;

//creating Parameterized constructor of BankAccount
	
public BankAccount (String accountNumber,double balance,String passWord) {
	
		//this.accountNumber=accountNumber;
		this.balance=balance;
		this.passWord=passWord;
	}
  public double getBalance() {
	  return balance;
	  
  }
  public void setBalance(int balance) {
		this.balance = balance;
	}
  
  public void setPassword(String passWord) {
	  this.passWord=passWord;
  }
  
  public String getPassWord() { 
	return passWord;
}
 
  public String withDraw(double withdrawAmount ) {
	  if (balance>=withdrawAmount) {
		double remainingBalance=balance-withdrawAmount;
		   balance=remainingBalance;
		   
		   return "Withdraw Success.\nYour Remaining Balance is: "+ balance;
	  }
	  else {
		  return "Transaction Failed as you have insufficient fund.\nYour balnce is 2000";
	  }
  }


public static void main(String[] args) {
	
	 BankAccount bank= new BankAccount("123", 2000, "a1");
	 
	 String statement=bank.withDraw(1500);
	 System.out.println(statement);
	 
	
}

}
 
	
	

