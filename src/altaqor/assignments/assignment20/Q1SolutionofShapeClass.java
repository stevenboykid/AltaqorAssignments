package altaqor.assignments.assignment20;

public class Q1SolutionofShapeClass {

	public static void main(String[] args) {
	
	Q1Shape[] sapeArray= new Q1Shape[4];
	sapeArray[0]=new Q1Circle(5);
	sapeArray[1]=new Q1Rectangle(2, 3);
	sapeArray[2]=new Q1Circle(3.4);
	sapeArray[3]=new Q1Rectangle(4, 5);

	
	for  (Q1Shape data: sapeArray) {  
		
	double result=	data.calculateArea();

	if (data instanceof Q1Circle) {
		System.out.println("Area of Circle is: "+ result);
		
	}else {
		System.out.println("Area of Rectangle is: "+ result);
	}
	}
	
}
}
