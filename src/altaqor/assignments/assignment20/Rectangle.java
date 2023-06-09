package altaqor.assignments.assignment20;

public class Rectangle extends Shape {
	private double l;
	private double b;

	// private double area;
	public Rectangle(double l, double b) {
		this.l = l;
		this.b = b;
	}

	public double calculateArea() {

		return l * b;
	}

}
