package altaqor.assignments.assignment10;

public class T1Student {
	//crating non-static method in this case never use "static" word  in Method 
	public void setStudentInfo(String fname, String lname, int id) {
		 System.out.println("Name: " +fname +" "+ lname );
		 System.out.println("RollNo: " +id);
	}

	public String  getStudentInfo(String fname, String lname, int id) {
		return "Name: "+ fname+ " "  + lname+ "\nRollNo:"+ id;
		
	}
	public  void  setAddress(String city, String country) {
		System.out.println("Address:" +city +","+ country);
		
	}
	
	public String  getAddress(String town,String city, String country) {
		return "Address:" +town+"," +city+"," + country;
		
	}
	private String setStudentCount() {
		return "Number of Students" + 10;
	}
	public boolean getStudentCount() {
		return true;
		
	}
public static void main(String[] args) {
	
	T1Student std = new T1Student();
	std.setStudentInfo("Ram", "Panday",05);

	String info = std.getStudentInfo("Hari","Bhattrai",03);
	System.out.println(info);
	
	//Student std =new Student();
	std.setAddress("Pokhara","Nepal");
	
	String add=std.getAddress("Baneshower", "Kathmandu", "Nepal");
	System.out.println(add);
	
	std.setStudentCount();
	System.out.println("Number of Student:" +10);
	
	std.getStudentCount();
	System.out.println("If number of Student = 10:" +true);
	
	
}	
	
}
