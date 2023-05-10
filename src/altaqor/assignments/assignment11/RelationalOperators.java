package altaqor.assignments.assignment11;

public class RelationalOperators {
 public static void main(String[] args) {
	 
	 int x = 5;
	    int y = 3;
	    System.out.println(x == y); // returns false because 5 is not equal to 3
	    System.out.println(x!= y);//returns true because 5 is not equal to 3
	    System.out.println(x<=y); //returns false
	    System.out.println(x>=y);//returns false 
	    System.out.println(x>y); //returns true
	    System.out.println(x<y); //returns false
	    /*These are the main Relational operators in java where in each and every comparison
	     the result is whether true or false*/
	    
	    boolean test1= x == y; //5=3 which is false
	    System.out.println(x +"==" + y + ":" +test1);
	
}
}
