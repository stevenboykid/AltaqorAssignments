package altaqor.assignments.assignment23;

import java.util.Arrays;

public class ArrayQuestion2TwoArrayEqualOrNot {
	public static void main(String[] args) {
		int[] array1= {5,4,3,2,1};
		int[] array2= {1,2,3,4,5};
		boolean isEqual =Arrays.equals(array1,array2);
		
		if(isEqual) {
			System.out.println("The Arrays are Equal.");
			
		}else {
			System.out.println("The Arrays are not Equal");
		}
	}
}
	
	