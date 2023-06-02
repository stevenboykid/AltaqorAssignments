package altaqor.assignments.assignment19;

 public  class T3Calculator {
	
	 int add(int a, int b) {
	    int sum=a+b;
		return sum;
	    
		}
	 double add(double a,double b) {
		return a+b;
	 	}
	 int add (int a, int b, int c) {
		 
		int sum=a+b+c;
		 return sum;
	 	}
	public static void main(String[] args) {
		
		T3Calculator calculation=new T3Calculator();
		 System.out.println("Sum of a and b is: " + calculation.add(33,67));
		 System.out.println("Sum of a and b is: " + calculation .add(35.50, 64.50));
		 System.out.println("Sum of a, b, and c is: "+ calculation.add(22,33,45));
		
	}
}
