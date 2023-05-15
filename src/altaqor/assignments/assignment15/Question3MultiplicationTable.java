package altaqor.assignments.assignment15;

public class Question3MultiplicationTable {
public static void main(String[] args) {
	
	//for(Initialization; Condition; Increment/Decrement)
	int multipleOf=19;
	int multiplier=1;
	int multiplactionValue=1;
	// inside the Small bracket we should use the same variable by unique name which is equal to our variable value ,here the variable value is multiplier.
	
	for (int i=1;i<=10;i++) {
		
		multiplactionValue=(multipleOf*multiplier);
		
		System.out.println(multipleOf +"*"+multiplier + "=" + multiplactionValue);
		multiplier++;
		
		
	}

}
}
