package altaqor.assignments.assignment10;

public class Department {
	
	public static String getDepartmentName(String depart) {
		return "DepartmentName:" + depart;
	}
	
	static void setDepartmentName(String depart) {
		System.out.println ("DepartmentName:" + depart);
		
	}
	
	 public static int getDepartmentCount() {
		 return 10;
	 }
	 

	public static void main(String[] args) {
		
		String department= Department.getDepartmentName("Computer Science");
		System.out.print(department);
		
		System.out.println("/n");
		
		Department.setDepartmentName("Information Technology");
		 
		Department.getDepartmentCount();
		System.out.println(10);
		
		
		
	}

	
	
}
