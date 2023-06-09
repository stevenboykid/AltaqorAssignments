package altaqor.assignments.assignment23;

public class ListQuestion1CopyElements {
	
	public static void main(String[] args) {
		 
		int[] age = {15, 25, 35, 45, 55};
	    int[] copyAge = new int[age.length];
	    
	    //For loop to copy the content of array 'age' to array 'copyAge'
	    for(int i = 0; i<age.length; i++)
	       copyAge[i] = age[i];
	    
	    System.out.println("The original Array of age is: ");
	    
	    for (int i = 0; i < age.length; i++)
	        System.out.print(age[i] + " ");
	  
	    System.out.println("\nContents of the copied array is:");
	    
	    for (int i = 0; i < copyAge.length; i++)
	        System.out.print(copyAge[i] + " ");
	}
}
