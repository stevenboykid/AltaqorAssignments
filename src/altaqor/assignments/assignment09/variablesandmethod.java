package altaqor.assignments.assignment09;

public class variablesandmethod {
	
	//declaring static variable 
	static String address= "301 Fair Oaks Blvd, Euless, Texas";
	static String email = "pahari.rc2010@gmail.com";
	static long phone = 6725457575l;
	
	public static void main(String[] args) {
		//declaring local (non-static) variables.
		String name = "Ramailo Manchhe";
		String dob = "10-25-1995";
		int age = 32;
		
		System.out.println("Instant Name :" + name);
		System.out.println("Date of Birth :" + dob);
		System.out.println("Age	:"+ age);
		
		System.out.println("Address :" + address);
		System.out.println("Email :" + email);
		System.out.println("Phone :" + phone);
		
		System.out.println("***********");
		
		
		final char UP = 'U';
		byte initialLevel =12;
		short location =15500;
		int score =3500000;
		boolean newGame= true;
		
		System.out.println("Hello Prosis");
		System.out.println("You have reached level " + initialLevel + " with a score of "+ score +" at location "+ location +".");
		System.out.println("Press " + UP + " to go up.");
		System.out.println("Is this a New Game? " + newGame);
			
	}
}
