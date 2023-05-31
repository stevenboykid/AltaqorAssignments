package altaqor.assignments.assignment14;

public class Question7FactorialCalculation {
public static void main(String[] args) {
	
		int num1=7;
		int result= 1;
		int i = num1;
		
		
		while (i>0){
			result=result *i;//note that calculation of result statement should place before the while loop completed.
			System.out.println("i"+i);
			i--;
						
		}
		System.out.println("Factorial value of 7 is: "+ result);
		
		//do while demo
		int num2=5;
		int result2=1;
		int f=num2;
		
		do {
			result2 =result2 * f;
			System.out.println("f" + f);
			f--;
		}
		
		while (f>0);
		System.out.println("Value of Factorial5=" +result);
	}
}
 