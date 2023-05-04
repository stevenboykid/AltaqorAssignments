package altaqor.assignments.assignment08;

public class Employee {
	//instant variables
	int id=33;
	String name="Shanker Dahal";
	int salary= 75000;
	
	//static variable
	static int employeeCount=100;
	static String companyName="ABC";
	
	public static void main (String[] args ) {
		
		//create the object in jave 
		Employee objectName = new Employee();
		
		//access the instant variables from the method.
		System.out.println("ID Instance : "+objectName.id);
		System.out.println("Name Instance : "+objectName.name); 
		System.out.println("Salary Instance :"+objectName.salary);
		
	
		//call static variable 
		System.out.println("Employee Count=  "+employeeCount );
		System.out.println("Company Name=  "+Employee.companyName );
		
		//local variable
		
		 String department ="Computer";
		 double taxRate =3.56;
		 System.out.println("DepartmentName=" + department);
		 System.out.println("Tax Rate =" + taxRate);
		 
	}

}
