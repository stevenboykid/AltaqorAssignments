package altaqor.assignments.assignment19;

public class T4StringManipulator {
	//method for count Occurrences
	
	public int countOccurrences (String str, char ch) {
		int length =str.length();
		int countChar = 0;
		
		for( int i =0; i<length; i++) {
			char charAtIndex=str.charAt(i);
			
			if (charAtIndex ==ch) {
				countChar =countChar+1;
				
			}
		}
	return countChar;
	
	}	
	public int countOccurrence (String str, String subString) {
		int countWord = 0;
		int startIndex = 0;
		int endIndex = 0;
		
		startIndex= str.indexOf(subString, startIndex);
		endIndex = startIndex+ subString.length();
		
		System.out.println("Start Index: " + startIndex);
		System.out.println("End Index: "+ endIndex);
		
		String data =str.substring(endIndex, endIndex);
		 if (data.equals (subString)) {
			 countWord = countWord +1;
			 
		 }
		return countWord;
				
	}
	public static void main(String[] args) {
		
		String data = " Demand is function of price of Commodity";
		char input = 'i';
		String subString = " ";
		//creating object of the class.
		
		T4StringManipulator myObj = new T4StringManipulator();
		
		//calling first method
		int resuultOccurances = myObj.countOccurrences(data,input);
		System.out.println("Result of Character Occurrence: "+ resuultOccurances);
		
		//second method
		
		int resuultWordOccurances = myObj.countOccurrence(data, subString);
		System.out.println("Result of Word Occurrence: "+ resuultWordOccurances);
		
	}
	
}
