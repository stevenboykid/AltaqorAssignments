package altaqor.assignments.assignment19;

public class T1Circle extends T1Shape {
	private double radious;
	
	public T1Circle (double radious) {
	 this.radious=radious;
	 
	}

	
	public double calculateArea() {
		
		return  Math.PI*radious*radious;
	}

}
