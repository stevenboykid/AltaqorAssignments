package altaqor.assignments.assignment17;

public class Question3CompareLexicographically {
	public static void main(String[] args) {
		
		String text1 = "Learn Java Programming";
	    String text2 = "Learn Structural Query Language";
	    int result;

	    // comparing str1 with str2
	    result = text1.compareTo(text2);
	    
	    if (result>0) {
	    	System.out.println("Result: "+ result +"\n Here text1 is greater than text2");
	    }
	    
	    if (result<0) {
	    	System.out.println("Result: "+ result +"\n Here text1 is less than text2");
	    }
	    
	    else {
	    	System.out.println("Result: "+ result +"\n Here text1 is equal to text2");
	    }
	  }
	}


