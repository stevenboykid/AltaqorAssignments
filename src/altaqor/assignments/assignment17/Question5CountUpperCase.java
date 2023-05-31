package altaqor.assignments.assignment17;

public class Question5CountUpperCase {
	public static void main(String[] args) {
		
		String text = "LiFe iS an OppoRtuNitY To do SomEthInG";
        int upper = 0;
        
       //here total length of 
        int length=text.length();
        
        
        for(int i = 0; i < length; i++)//for-each loop to look char A to Z
        {
            char ch = text.charAt(i);
            
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            
        }
        
        System.out.println("Upper case letters : " + upper);
	}

}
