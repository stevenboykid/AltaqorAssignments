package altaqor.assignments.assignment17;

import java.util.Scanner;

public class Question8RemoveAllVowels {
	
	public static String removeVowels(String str) {
		return str.replaceAll("[aeiouAEIOU]", " ");//Replace Vowels alphabets with blank out of anySpace.
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String inputString = scanner.nextLine();
		scanner.close();
		
		String resultString=removeVowels(inputString);
		System.out.println("Modified String: "+ resultString);
		
	}

}
