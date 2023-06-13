package altaqor.assignments.assignment20;

public class Q2Employee {
	//declaring instance variable
	String name;
	double salary;
	
	 //Parameterized constructor to initialize instance variable
	Q2Employee(String name,double salary){
		this.name = name;
		this.salary = salary;
	}
	//Method of displayInfo
	public void displayInfo() {
		System.out.println("Name of Employee: "+ name);
		System.out.println("Salary: "+ salary);
	}
	
	
}
