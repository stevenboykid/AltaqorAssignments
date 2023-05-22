package altaqor.assignments.assignment13;
	
	import java.util.Scanner;//import the scanner 

public class T2Q1LargestNumAmongThree {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner (System.in);//creating scanner object.
		
		System.out.println("Enter 1st number :");
	      int a = myScanner .nextInt();
	      
	      System.out.println("Enter 2nd number :");
	      int b =myScanner .nextInt();
	      
	      System.out.println("Enter 3rd number :");
	      int c = myScanner .nextInt();
//using if else condition to compare three given value...
	      if ( a > b && a > c ){
	         System.out.println("Largest number is ::"+ a);
	      		}
	      else if ( b > a && b > c ){
	         System.out.println("Largest number is ::"+ b);
	      		}
	      else if ( c > a && c > b ){
	         System.out.println("Largest number is ::"+ c);
	      		}
	      else if (a==b &&b==c) {
	    	  System.out.println("There is no differences all intigers are with same value");
	      		}
	      else{
	         System.out.println("Cannot validate");
	      }
	   }
	
}
	///the end for this class

		
		
		
		
	

