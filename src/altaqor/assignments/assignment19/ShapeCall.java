package altaqor.assignments.assignment19;

public class ShapeCall extends T1Shape{

	
	public void calculateAreaOfRectangle(double l, double b) {
		double area= l*b;
		System.out.println("Area of Rectangle is : "+ area);
	}

	
	public void calculateAreaOfCircle(double r) {
		double t =22;
			 t= (t/=7);
		double area1= t*r*r;
		
		System.out.println("Area of Circle is: "+ area1);
		
	}
 public static void main(String[] args) {
	//creating Object for class ShapeCall
	 ShapeCall shape =new ShapeCall();
	 //calling methods
	 shape.calculateAreaOfCircle(5);
	 shape.calculateAreaOfRectangle(3.5,4);
}
}
