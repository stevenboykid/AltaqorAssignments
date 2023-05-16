package altaqor.assignments.assignment16;

	public class Question2SumOfDoubleArray {
		public static void main(String[] args) {
			int i=1;
			double sum=0;
			double [] prices= {45,75.50,100,55.5,500,125.75,23.25};
			 for (double price : prices) {
				
				 System.out.println("Per Unit Price"+i+"=" + price);
				 sum=sum+price;
				  i++;
			 }
	 
			 System.out.println("Aggregate Sum of all Prices is =" + sum);
}
}
