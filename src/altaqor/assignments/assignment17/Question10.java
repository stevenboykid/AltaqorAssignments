package altaqor.assignments.assignment17;

public class Question10 {
	public static void main(String[] args) {
		String str = "Learning Java Programming";
		   // character whose frequency must be determined
	           char ch = 'o';
	           // store the frequency in freq
	           int freq = 0;

	           // iterate through the string
	           for(int i = 0; i < str.length(); i++) 
	           {
	               // if the specified character
	               // appears in the string
	               if(ch == str.charAt(i)) 
	               {
	                   // increase freq by 1
	                   ++freq;
	               }
	           }
	        
	           // print the total occurrence of 'ch'
	           System.out.println("Frequency of " + ch + " = " + freq);
			
	   }
	

	}

