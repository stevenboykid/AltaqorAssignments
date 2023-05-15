package altaqor.assignments.assignment14;

public class Question4MultiplicationTable {
	public static void main(String[] args) {
		//While loop
		int multipleOf = 13;
		int multiplier= 1;
		int multiplicationValue=1;
		while (multiplier<=10) {
			multiplicationValue = (multipleOf * multiplier);
			System.out.println(multipleOf + "*" + multiplier +"=" + multiplicationValue);
			multiplier++;
		}
		
		
	System.out.println("***");	
//do-while loop.....
	multipleOf = 14;
		multiplier=1;
		
		do {
			multiplicationValue = (multipleOf * multiplier);
			System.out.println(multipleOf + "*" + multiplier +"=" +multiplicationValue);
			multiplier++;
		}
		
		while(multiplier<=10); 	
		
		}
	
	
	
	
	}


