package altaqor.assignments.assignment17;

public class Question4 {
	public static void main(String[] args) {
		
		String email= "pahari.rc2010@gmail.com";
		boolean contentEqualsCheck=email.contentEquals("pahari.rc2020@gmail.com");
		System.out.println(contentEqualsCheck);
		//using if condition for validity checking
		
		if ( email== "pahari.rc2020@gmail.com") {
			System.out.println("string is a valid email address");
			
		}
		
		else {
			System.out.println("String is not a Valid Address");
		}
	}
}
