package altaqor.assignments.assignment20;

public class Q1Circle extends Q1Shape {
	private double radious;

	public Q1Circle(double radious) {
		this.radious = radious;

	}

	public double calculateArea() {

		return Math.PI * radious * radious;
	}

}
