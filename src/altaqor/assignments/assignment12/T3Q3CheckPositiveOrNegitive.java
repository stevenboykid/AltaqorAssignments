package altaqor.assignments.assignment12;

public class T3Q3CheckPositiveOrNegitive {
 public static void main(String[] args) {
	int x=-7;
	 boolean pCheck= x>0;
	 boolean nCheck= x<0;
	 boolean zCheck=x==0;
	if (pCheck) {
		System.out.println("positive Number");
		
	}
	if (nCheck) {
		System.out.println("Negative Numver");
	}
	if (zCheck) {
		System.out.println("zero");
	}
}
 
}
