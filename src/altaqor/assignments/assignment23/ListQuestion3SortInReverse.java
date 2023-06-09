package altaqor.assignments.assignment23;

import java.util.ArrayList;
import java.util.Collections;

public class ListQuestion3SortInReverse {
	public static void main(String[] args) {
		
	ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(33);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(34);
    myNumbers.add(18);
    myNumbers.add(12);
    
   Collections.sort(myNumbers);  // Sort myNumbers(always in ascending order)

    for (int i : myNumbers) {
      System.out.println(i);
   
    }
    
    //sorting integers in reverse orders
    Collections.sort(myNumbers,Collections.reverseOrder());
    
    System.out.println(myNumbers);

	}
}