package altaqor.assignments.assignment20;

public class Manager extends Employee {
	double bonus;
	Manager(String name, double salary,double bonus) {
		super(name, salary);
		this.bonus=bonus;
		
		
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Bonus is: " + bonus);
			
	}
	
	
	public static void main(String[] args) {
		Employee[] emp= new Employee[5];
		emp[0]= new Employee("Ronaldo", 55000);
		emp[1]= new Manager("John",85000,5550);
		emp[2]= new Employee("Anjila", 45000);
		emp[3]= new Manager("Pratima",75000,3500);
		emp[4]= new Employee("HariKrishna",50000);
		
				
				for  (Employee employee: emp) {  
					employee.displayInfo();
			
			}
				
		}
			
	}

		
	

	
