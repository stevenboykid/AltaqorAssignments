package altaqor.assignments.assignment10;

public class T2Department {
	
	// static method with String as return types.
	public static String getDepartmentName(String deptName) {
		return "Department Name:" + deptName;
	}
	
	//method with deptName as parameter.
	static void setDepartmentName(String deptName) {
		System.out.println ("Department Name:" + deptName);
		
	}
	//static method with integer return type.
	 public static int getDepartmentCount() {
		 return 0;
	 }
	 

	public static void main(String[] args) {
		//static class belongs to  the class but not in object so we dont't need object here.
		//we can call the static method by "className.MethodName()" as follows:
		
		String department= T2Department.getDepartmentName("Computer Science");
		System.out.print(department);
		
		System.out.println("/n");
		
		T2Department.setDepartmentName("Information Technology");
		 
		T2Department.getDepartmentCount();
		System.out.println(10);
		
		
		
	}

	
	
}
