package altaqor.assignments.assignment10;

public class Student {
	
	public void setStudentInfo(String fname, String lname, int id) {
		 System.out.println("Name: " +fname +" "+ lname );
		 System.out.println("RollNo: " +id);
	}

	public String  getStudentInfo(String fname, String lname, int id) {
		return "Name: "+ fname+ " "  + lname+ "\nRollNo:"+ id;
		
	}
	public  void  setAddress(String city, String country) {
		
		
	}
	public void getAddress() {
		
	}
	private int setStudentCount() {
		return 0;
	}
	private double getStudentCount() {
		return 4.3;
	}
public static void main(String[] args) {
	
	
	
}	
	
}
