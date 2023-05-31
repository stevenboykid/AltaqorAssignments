package altaqor.assignments.assignment13;

import java.util.Scanner;

public class T2Q4CheckLowerOrUpperCase {
	
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter any caracter : ");
        char ch = myScanner.next().charAt(0);

        // Using character class
        if (Character.isUpperCase(ch)) { 
            System.out.println(ch + " is UPPERCASE alphabet.");
            } 
        
        else if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is LOWERCASE alphabet.");
            }
        
        else {
            System.out.println(ch + " is not an alphabet.");
        }
	}
}
