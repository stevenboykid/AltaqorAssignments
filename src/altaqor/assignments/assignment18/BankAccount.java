package altaqor.assignments.assignment18;

public class BankAccount {
 //Creating instance constructor
	//private String accountNumber;
	private double balance;
	private String passWord;

//creating Parameterized constructor of BankAccount
	
public BankAccount (String accountNumber,double balance,String passWord) {
	
		//this.accountNumber =accountNumber;
		this.balance=balance;
		this.passWord=passWord;
	}
  public double getBalance() {
	  return balance;
	  
  }
  public void setBalance(double balance) {
		this.balance = balance;
	}
  
  public void setPassword(String passWord) {
	  this.passWord=passWord;
  }
  
  public String getPassWord() { 
	return passWord;
}
 
  public void withDraw(double withdrawAmount ) {
	  if (balance<withdrawAmount) {
		  System.out.println("Transaction Failed as you have insufficient fund.\n Your balnce is: "+ balance);
	  
	  	}else {
			  balance-= withdrawAmount;
			  System.out.println("Withdrawal of " + withdrawAmount + " is Successful\n Your Remaining Balance: "+balance);
		  }
			  
		}
		 
		  public static void main(String[] args) {
			  String acc= "01r12345";
			  BankAccount account =new BankAccount(acc,10000.00,"RP123");
			  System.out.println("Your Transacton Account Number: " + acc); 
			  //perform withdrawal operation
			  double withdrawAmount=5000.00;
			  account.withDraw(withdrawAmount);
			 
			 
			 			
		}



	 
	
}


 
	
	

