package altaqor.assignments.assignment10;

public class StudentTest {

	
	
	public static void main(String[] args) {
		//calling non-static methods from class Student.
		
		Student declaration =new Student();
		
		declaration.setStudentInfo("Ram","Pahari",33);
		
		//calling method getStudentInfo with Return value String.
		String info =declaration.getStudentInfo("Mohan", "Pahari", 11);
		System.out.println(info);
		
		declaration.setAddress("kathmandu", null);
		
		String address=declaration.getAddress("LakeSide", "Pokhara", "Nepal");
		System.out.println(address);
		
		boolean count=declaration.getStudentCount();
		System.out.println(count);
		
		//setStudentCount is Private static method so it is not accessible in different class.
			/*String count1 =declaration.setStudentCount();
			System.out.println();*/
		
	
	
	
	
	

	
	}
	
	
}
