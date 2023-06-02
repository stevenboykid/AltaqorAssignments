package altaqor.assignments.assignment11;
import java.util.Scanner;
public class LogicalOperators {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    System.out.println("Input the three sides of the triangle: ");

	    int p = scanner.nextInt();
	    int q = scanner.nextInt();
	    
	    int r = scanner.nextInt();

	    scanner.close();

	    if (p + q <= r || p + r <= q || q + r <= p) {
	      System.out.println("Invalid Triangle");
	    } 
	    else {
	      System.out.println("Valid Triangle");

	}

	}
}
