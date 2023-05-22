package altaqor.assignments.assignment17;

public class Q5CountUpperCase {
	public static void main(String[] args) {
		 String str = "LiFe iS an OppoRtuNitY To do SomEthInG";
        int upper = 0;
 
        for(int i = 0; i < str.length(); i++)//for-each loop to look char A to Z
        {
            char ch = str.charAt(i);
            
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            
        }
 
        
        System.out.println("Upper case letters : " + upper);
	}

}
