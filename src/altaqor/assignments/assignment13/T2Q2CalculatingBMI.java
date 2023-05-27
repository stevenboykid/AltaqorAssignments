package altaqor.assignments.assignment13;
	
	import java.util.Scanner;
	
public class T2Q2CalculatingBMI {
	
	public static void main(String[] args) {
		Scanner myScanner = new Scanner (System.in); 
		System.out.print("Input weight in kilogram: ");
		
	      double weight = myScanner.nextDouble();
	      System.out.print("Input height in meters: ");
	      
	      double height =myScanner.nextDouble();
	      double BMI = (weight / (height * height)); //formula to calculate the BMI(Body Mass Index) is weight divided by Square of Height.
	      System.out.print("The Body Mass Index (BMI) is " + BMI + " kg/m2");

	
}
}
