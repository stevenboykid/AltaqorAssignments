package altaqor.assignments.assignment18;

public class Person {
	//Declare variable 
	private  String name;
	private int age;
	
	//parameterized constructor
	public Person(String name, int age) {
		
		this.name= name;
		this.age = age;
		}
	
		//getter method for person name.		
		public String getName() {
			return name;
			
		}
	//create setter method for name;
		public void setName(String name) {
			this.name=name;
			}
		
	//getter method for age
	public int getAge() {
			return age;
		}
	//setter method for age
		public void setAge(int age) {
			this.age = age;
		}
		//main method
	public static void main(String[] args) {
		
		Person myObject=new Person("Ram",25);
		
		//myObject.setName("Petter");
		//myObject.setAge(25);
		
		 
		
		String name=myObject.getName();
		int age =myObject.getAge();
		
		System.out.println("Name of Person: " + name);

		System.out.println("Age of Person: "  + age);
	}
	
}
