package altaqor.assignments.assignment17;

public class Question11LongestWord {
	
	public static String findLongestWord(String str) {
		String[]words = str.split("\\s+");//Confusion about "\\s+".
		String longestWord = ""; // 
		 
		int maxLength = 0;
		for (String word : words) {
			if (word.length()>maxLength) {
				maxLength=word.length();
			longestWord = word;	
			}
		}
		return longestWord;
	}
		
	
 public static void main(String[] args) {
	 
     String myString = "Life is an opportunity to do something special";
     
     String longestword = findLongestWord(myString);
    
     System.out.println("Longest word: " + longestword);
  

 	}
 
}
