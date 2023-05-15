package altaqor.assignments.assignment13;

public class T1Q3CalculationOfTcAndDiscount {
	public static void main(String[] args) {
		double perunitcost = 100;

		int quantity = 11;

		double totalCost = (perunitcost * quantity);

		if (totalCost > 1000) {

			double discountPercentage = 10;
			double discountAmount = discountPercentage * (totalCost / 100);
			double actualcost=(totalCost-discountAmount);
		System.out.println("PerUnit Price = "+ perunitcost);	
		System.out.println("Quantity Purchase =" +quantity);
		System.out.println("your Discount(%)= " + discountPercentage);
		System.out.println("Total Cost = "+ totalCost);
		System.out.println("Total Discount Amount = "+discountAmount);
		System.out.println("Actual Amount After Discount = "+ actualcost);
		}
	}



	}


