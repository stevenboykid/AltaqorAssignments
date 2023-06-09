package altaqor.assignments.assignment20;

public class Employee {
	String name;
	double salary;
	 
	Employee(String name,double salary){
		this.name = name;
		this.salary = salary;
	}
	
	public void displayInfo() {
		System.out.println("Name of Employee: "+ name);
		System.out.println("Salary : "+ salary);
	}
	
	
}
