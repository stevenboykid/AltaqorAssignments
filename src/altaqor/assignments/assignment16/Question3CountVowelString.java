
package altaqor.assignments.assignment16;
	
public class Question3CountVowelString {
	
	public static void main(String[] args) {
		  
		int countV = 0;  
	     
		//Declare a string    
		String myString = "Demand is function of  the Price of Commodity.";    
				            
	    //Converting entire string to lower case to reduce the comparisons    
			myString = myString.toLowerCase();    
				            
			for(int i = 0; i < myString.length(); i++) {    
				   
		//Checking whether the character is equal to Vowel char or not.    
			  if(myString.charAt(i) == 'a' || myString.charAt(i) == 'e' || myString.charAt(i) == 'i' 
			     || myString.charAt(i) == 'o' || myString.charAt(i) == 'u') {    
				                
		//Increments the vowel counter    
				countV++; 
				
				       }    
			
			}   
			System.out.println("String Input:\n " + myString);
			System.out.println("Total length of String is: "+ myString.length());
			System.out.println("Number of vowels: " + countV);    
			
		}
	
	}
            
    

