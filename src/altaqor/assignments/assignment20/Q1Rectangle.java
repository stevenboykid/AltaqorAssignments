package altaqor.assignments.assignment20;

public class Q1Rectangle extends Q1Shape {
	private double l;
	private double b;

	// private double area;
	public Q1Rectangle(double l, double b) {
		this.l = l;
		this.b = b;
	}

	public double calculateArea() {

		return l * b;
	}

}
