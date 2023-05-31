package altaqor.assignments.assignment12;

public class T1UnaryOperators {


	public static void main(String[] args) {
		int a = 5;
		int b = 15;
		int c = 10;
		boolean d = true;
		System.out.println("Increment Operator");
		System.out.println(a++);
		System.out.println(a);//a=5+1=6
		//
		System.out.println("Decrement Operator");
		System.out.println(b--);
		System.out.println(b);//b=15-1=14
		
		System.out.println("Negation Operator");
		System.out.println(c);
		System.out.println(~c);//-(10)-1= -11
		
		System.out.println("Inverting the value of a Boolean 'true'");
		System.out.println(!d);//Here the opposite of true is false so the output is= 'false'
		
		
		
		
	}
}

