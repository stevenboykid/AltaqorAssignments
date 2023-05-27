package altaqor.assignments.assignment16;

	import java.util.ArrayList;
	import java.util.List;
public class Question4 {
//Creating List object and ArreyList to apply for each loop.
	public static void main(String[] args) {
		List aList = new ArrayList();
	      aList.add("Ram");
	      aList.add("Sita");
	      aList.add("Gita");
	      aList.add("Damoder");
	      aList.add("Prosis");
	      aList.add("Hari");
	      
	      if(aList.contains("Sita"))
	         System.out.println("The String Sita is found.");
	      else
	         System.out.println("The String Sita is not found.");

	      if(aList.contains("Shanker"))
	         System.out.println("The String Shanker is found in list");
	      else
	         System.out.println("The String Shanker is not found in list");

}
}
