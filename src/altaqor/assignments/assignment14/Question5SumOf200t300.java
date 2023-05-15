package altaqor.assignments.assignment14;

public class Question5SumOf200t300 {
	public static void main(String[] args) {
		
	
	//while loop
	int number=200;
	int sum = 0;
	
	while (number<=300) {
	sum = sum + number;
		number++;
	}
		
	System.out.println("Sum of 200 to 300 is: " + sum);
	 
	 number=200;
	 sum = 0;
	
	//do while loop
	
	do {
		sum = sum + number;
		
		
		number++;
		
	
	}

	while (number<300);
	System.out.println("sum of 200 to 300 included is:" + sum);
	 
	}

}

