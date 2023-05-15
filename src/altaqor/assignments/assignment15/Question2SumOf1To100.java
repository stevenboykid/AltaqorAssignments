package altaqor.assignments.assignment15;

public class Question2SumOf1To100 {
	public static void main(String[] args) {
		
		int sum=0;
		for (int i =1;i<=100;i++) {
			sum=sum+i;
			System.out.println("Sum of 1 to" + i +"is:" + sum);
			//i++;
		}
		System.out.println("Hence, the total Sum of 1 to 100 is  =" + sum);
	}
	

	
}
