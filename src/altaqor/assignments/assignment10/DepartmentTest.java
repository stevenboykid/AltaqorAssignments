package altaqor.assignments.assignment10;

public class DepartmentTest {
	
	public static void main(String[] args) {
		//calling static methods from class Student.
		Student information =new Student();
				information.setStudentInfo("Ram","Pahari",33);
				
				//calling method getStudentInfo with Return value String.
				String info =information.getStudentInfo("Mohan", "Pahari", 11);
				System.out.println(info);
				
				//calling setAddress method
				information.setAddress("kathmandu", null);

				//calling getAddress method
				String address=information.getAddress("LakeSide", "Pokhara", "Nepal");
				System.out.println(address);
				
				//calling getStudentCount method  
				boolean count=information.getStudentCount();
				System.out.println(count);
				
				//setStudentCount is Private static method so it is not accessible in different class.
					/*String count1 =declaration.setStudentCount();
					System.out.println();*/
			

	
	}
	
	
}
