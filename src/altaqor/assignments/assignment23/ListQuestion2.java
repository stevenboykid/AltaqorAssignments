package altaqor.assignments.assignment23;

public class ListQuestion2 {
	public static void main(String[] args) {
		
		int[] numbers= {13, 33, 35, 88, 23, 11, 99 };
		
		 int min = numbers[0];//minimum number=13
		 int max = numbers[6];//maximum number =33
		 
		 for (int i =0; i<numbers.length; i++) {
			
			 int num = numbers[i];
			 
				if (num<=min) {//8<13 then take num i,e.8 as minimum number.
					min=num;
		 }
		 
			if (num>=max) {//99>33 then take numumber 99 as maximum number.
				max = num;
				
			}
		}
		 
		System.out.println("Minimum Number is: " + min);
		System.out.println("Maximum Number is: " + max);	
		  
		}


	}

