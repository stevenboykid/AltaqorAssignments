package altaqor.assignments.assignment16;
	
import java.util.Scanner;
public class Question5SumOfNumbersUpToNegativeInput {
 
	public static void main(String[] args) {
	
		int number, sum = 0;

        // create an object of Scanner
        Scanner input = new Scanner(System.in);
            
        while (true) {
            System.out.print("Enter your number: ");

            // takes double input from user
            number = input.nextInt();
         
            // if number is negative the loop terminates
            if (number < 0) {
                break;
            }
         
           sum += number;
        }
        System.out.println("Sum = " + sum);
    }


}

