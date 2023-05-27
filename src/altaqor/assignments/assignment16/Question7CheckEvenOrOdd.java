package altaqor.assignments.assignment16;

import java.util.Scanner;

public class Question7CheckEvenOrOdd {
	public String CheckevenOdd(int number){
		if (number % 2 == 0){
	    	return (number + " is even.");
	    
	    } 
	       
	    else {
	    	return (number + " is odd.");
	    }   
		
	}
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = reader.nextInt();
        
			 Question7CheckEvenOrOdd check=new Question7CheckEvenOrOdd ();
			 
			 
			 
			String message= check.CheckevenOdd(number);
			System.out.println(message);
			   
			
			
			  
			
			}
	
	
			    
	}
  



