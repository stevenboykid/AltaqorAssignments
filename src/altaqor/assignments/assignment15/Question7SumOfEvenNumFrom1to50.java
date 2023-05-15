package altaqor.assignments.assignment15;

public class Question7SumOfEvenNumFrom1to50 {
public static void main(String[] args) {
	
	//calculating the sum of even number from 1 to 50.
	int sum =0;
	for(int i =2; i<=50;i++) {
		sum=sum+i;
		System.out.println("Sum of 1 to" + i +"is:" + sum);
		i=i+1;//here i=2++, so i=3+1=4 likewise increase the value by one and become an even number.
		
	}
	System.out.println("Hence,total Sum of all even Number up to 50:" + sum);
	}

}
