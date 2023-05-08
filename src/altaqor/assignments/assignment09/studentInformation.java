package altaqor.assignments.assignment09;

public class studentInformation {
	//Fields, data members,instance variables.
	private int studentId;
	private String studentName;
	private String studentAddress;
	
	//Constructors
	public studentInformation(int studentId, String studentName, String studentAddress) {
		this.studentId= studentId;
		this.studentName= studentName;
		this.studentAddress= studentAddress;		
	}
	//class method
	public String showStudent() {
		return "Id: "+studentId + "\nName : "+studentName + "\nAddress : "+studentAddress;
		
	}
	 
	
	public static void main (String [] args) {
		//creating a class instance (objects)
		studentInformation student =new studentInformation(33,"Krishan Kumar Pandey","LakeSide, Pokhara, Nepal");
		
		//calling methods
		String studentDetails=student.showStudent();
		System.out.println(studentDetails);
			
	}
			}
