package altaqor.assignments.assignment20;

public class Q2Manager extends Q2Employee {
	
		double bonus;
	Q2Manager(String name, double salary,double bonus) {
		super(name, salary);
		this.bonus=bonus;
		
		
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Bonus is: " + bonus);
			
	}
	
	
	public static void main(String[] args) {
		//Creating array of employee object(i.e,Q2Employee Class) which stores both employee and managers.
		Q2Employee[] emp= new Q2Employee[5];
		emp[0]= new Q2Employee("Ronaldo", 55000);
		emp[1]= new Q2Manager("John",85000,5550);
		emp[2]= new Q2Employee("Anjila", 45000);
		emp[3]= new Q2Manager("Pratima",75000,3500);
		emp[4]= new Q2Employee("HariKrishna",50000);
		
				
				for  (Q2Employee employee: emp) {  
					employee.displayInfo();
			
			}
				
		}
			
	}

		
	

	
