package altaqor.assignments.assignment14;

public class Question1WhileLoop {
	public static void main(String[] args) {
		
		//while (condition){   Code block }
		
		int i = 0;
		while(i<10) {
			System.out.println("Print:" +i);
			System.out.println("Name : Ram Pahari");
			System.out.println("Country : Nepal");
			i++; // i++ refers same as i=i+1
		}
		System.out.println("Above example is from while loop and following is form do-while loop statement,Variable is same.");
		//do while 
		int a =0;
		do {
			System.out.println("Print:" +a);
			System.out.println("Name : Ram Pahari");
			System.out.println("Country : Nepal");
			
		a = a +1;// i= i+1 refers to the next printing step increase by one.
					
		}
		
		while (a<10);	
	
	
}
}
