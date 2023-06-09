package altaqor.assignments.assignment20;

public class SolutionofShapeClass {

	public static void main(String[] args) {
	
	Shape[] sapeArray= new Shape[4];
	sapeArray[0]=new Circle(5);
	sapeArray[1]=new Rectangle(2, 3);
	sapeArray[2]=new Circle(3.4);
	sapeArray[3]=new Rectangle(4, 5);

	for  (Shape data: sapeArray) {  
		
	double result=	data.calculateArea();

	if (data instanceof Circle) {
		System.out.println("Area of Circle is: "+ result);
		
	}else {
		System.out.println("Area of Rectangle is: "+ result);
	}
	}
	
}
}
