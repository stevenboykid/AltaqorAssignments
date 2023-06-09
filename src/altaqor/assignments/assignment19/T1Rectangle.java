 package altaqor.assignments.assignment19;

public class T1Rectangle extends T1Shape{
	
	private double length;
	private double width;
	
	public T1Rectangle (double length, double width) {
		this.length = length;
		this.width = width;	
		
	}

	public double calculateArea() {
		
		return length*width;
	}
	
	 public static void main(String[] args) {
		T1Rectangle rectangle = new T1Rectangle(6,9);
		T1Circle circle =new T1Circle(2.5);
		System.out.println("Area of Rectangle: "+ rectangle.calculateArea());
		System.out.println("Area of Circle: "+ circle.calculateArea());
		
	}
	

}
