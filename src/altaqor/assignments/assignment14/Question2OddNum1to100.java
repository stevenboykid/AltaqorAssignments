package altaqor.assignments.assignment14;

public class Question2OddNum1to100 {
	public static void main(String[] args) {
		//solution for while loop.
		int r=1;
		while(r<100) {
		System.out.println(r);
		r=r+2;
		}
	
		System.out.println("Calculating value through do_while loop.");
		
		
		//Solution for do- while loop.
		int i=1;	
		//for (int i =1; i<=100;i=i+2..it is alternative method to return odd numbers by using for loop)
		//for(initialization; condition; increment/decrement value)
		do {
			
			System.out.println(i);
			i =i+2;
			
			
		}
		while (i<=100);
	}

}
