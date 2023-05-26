package altaqor.assignments.assignment17;

public class Question4 {
	public static void main(String[] args) {
		
		String email= "pahari.rc2010@gmail.com";
		if ((email.contains("@")) && (email.contains("."))){
			
			if (email.indexOf('@')>0) {
				
				if ((email.indexOf('.')>0) && (email.indexOf('.')< email.length()-1)) {
					
					System.out.println("YOur Email is Valid.");
				}
				else {
					System.out.println("Email is not Valid");
				}
				
			}
			
		}
		
	}
	
}
			
			
			
		
		

