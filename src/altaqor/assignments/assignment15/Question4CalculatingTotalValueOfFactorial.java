package altaqor.assignments.assignment15;

public class Question4CalculatingTotalValueOfFactorial {
public static void main(String[] args) {
	
 int num1=7;
 int result= 1;
	for (int i=num1;i>0;i--) {
		System.out.println("i"+i);
		result= result*i;
		
	}
	
	System.out.println(result);	
}
}
