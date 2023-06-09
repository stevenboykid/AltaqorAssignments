package altaqor.assignments.assignment20;

public class Circle extends Shape {
	private double radious;

	public Circle(double radious) {
		this.radious = radious;

	}

	public double calculateArea() {

		return Math.PI * radious * radious;
	}

}
