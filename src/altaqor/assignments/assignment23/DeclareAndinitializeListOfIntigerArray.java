package altaqor.assignments.assignment23;

import java.util.ArrayList;
//import java.util.List;

public class DeclareAndinitializeListOfIntigerArray {
	public static void main(String[] args) {
		ArrayList<Integer>myAge=new ArrayList<Integer>();
		myAge.add(13);
		myAge.add(23);
		myAge.add(30);
		myAge.add(40);
		myAge.add(35);
		System.out.println("Array of My Age: " + myAge);//this print the integer in horizontal set.
		
		for (Integer number : myAge) {
            System.out.println(number); //this command print the integer in vertical set.
        }
	}
	
	}

	
		
		
		

	
	

