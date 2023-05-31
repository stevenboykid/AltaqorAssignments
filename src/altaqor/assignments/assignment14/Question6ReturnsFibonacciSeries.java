package altaqor.assignments.assignment14;

public class Question6ReturnsFibonacciSeries {
public static void main(String[] args) {
	//Fibonacci series of numbers are like o,1,1,2,3,5,8,13,21,34,55,98,153,...
	int n1=0,n2=1,n3,count=11,i=2;
	
	System.out.println(n1+ ","+n2);
	
	
	
	while (i<=count) {		
		
    n3=n2+n1;
		System.out.println(""+n3);
		n1=n2;
		n2=n3;
		i++;
		
		
	}
}
}
