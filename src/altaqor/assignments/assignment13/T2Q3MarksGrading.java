package altaqor.assignments.assignment13;

public class T2Q3MarksGrading {
	public static void main(String[] args) {
		
		double scores =77.00;
		
		if (scores>=90 ) {
			System.out.println("Grade: 'A'");
		}
		
		else if (scores >=80 && scores <=89){
			System.out.println("Grade: 'B'");
		}
		
		else if (scores >=70 && scores <=79) {
			System.out.println("Grade: 'C'");
		}
		
		else if (scores >=60 && scores <=69) {
			System.out.println("Grade: 'D'");
		}
		else if (scores >=50 && scores <=59) {
			System.out.println("Grade: 'E'");
		}
		
		else {
			System.out.println("Failed");
		}
	}
}
