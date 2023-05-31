package altaqor.assignments.assignment11;

public class AssignmentOperators {
	
	//construction of different method for division and assignment operator
	public void addDivisonAssignment(int num1,int num2) {
		num1/=num2; //num1=num1/num2=50/25=2
		System.out.println("/= :" +num1);
				
	}
	public static void main(String[] args) {
		
		//+= add and assignment operator
				int num1=50;
				int num2=25;
				int num3=5;
				num2+= num1; //num2 = num2+num1=25+50=75
				System.out.println("+= :" + num2);
				
				
		//-= subtract and assignment operator
				num2-= num1;//num2 =num2-num1=75-50=25
				System.out.println("-= :" + num2);
		
		//*= Multiplication and assignment operator
				num3*=num1; //num3 =mun3*num1=5*50=250
				System.out.println("*= :" + num3);
				
				
		//Creating objects for AssignmentOperattors class to call sddDivisionAssignment method
				AssignmentOperators division = new AssignmentOperators();
				division.addDivisonAssignment(num1,num2);
				
		//%= modulus and assignment operator
				num1%=num2; //num1=0 as there is no reminder in (50/25=2).
				System.out.println("%= :" + num1);
				
	}

}
