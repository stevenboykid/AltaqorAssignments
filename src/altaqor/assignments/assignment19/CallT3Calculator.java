package altaqor.assignments.assignment19;



public class CallT3Calculator {

	
	public static void main(String[] args) {
		T3Calculator calculation = new T3Calculator();
		
		int add1=calculation.add(10, 20);
		System.out.println("Sum of a and b is: "+add1); 
		
		double add2=calculation.add(45.36,54.64);
	    System.out.println("Addition of a and b is:" + add2);
	    
	    int add3=calculation.add(10, 20, 30);
	    System.out.println("Addition of a, b, and c is: "+add3);
	}
	
}
