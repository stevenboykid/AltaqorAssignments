package altaqor.assignments.assignment23;

import java.util.Scanner;

public class Question3ArrayMethods {
	public static void main(String[] args) {
		
		//declaring array of numbers with 10 elements
		//int[] number=new int[5];
		
System.out.println("Enter a size of Array numbers:  ");
		
		Scanner scanner =new Scanner(System.in);
		int size = scanner.nextInt();
		int[] numbers =new int[size];//creating object of size for array numbers.
		
		//this statement is used to create an array of numbers.
		for (int i=0; i<size; i++) {
			System.out.println("Enter a number");
			int number = scanner .nextInt();
			numbers[i]=number;
			
		}
		
		//looping statement to fetch data from array(this is used to Access array data)
		int index=0;
		while (index<size) {
			int num =numbers[index];
			System.out.println("Index: "+ index + " Value: "+ num);
			
			 index = index+1;
			
			}
		//Displaying the elements in Normal array4
		
		}
	
}


