package altaqor.assignments.assignment18;

public class Question1Person {
	//declaring instance variables
     private String name;
	 private int age;
	//construction of nonArgumet constructor (its name should be same with the name of class name). 
	public Question1Person() {
		
		name = "HariKrishna Lamichhene";
		age = 33;
		
	}

	public void showPerson() {
		System.out.println("Name of Person: " + name );
		
		System.out.println("Age of Person: " + age);
	}
	public static void main(String[] args) {
		//creating Object of class
		
		Question1Person myObj=new Question1Person();
		//now calling the method showPerson
		myObj.showPerson();
		
		}
	
		
	}


