package Chapter06.exercise11;

public class ComputeCommissions {

	public static void main(String[] args) {

		
		System.out.println("Sales Amount\tComission");
		for (double salesAmount = 10000; salesAmount <= 100000; salesAmount+=5000) {
			System.out.println(salesAmount + "\t\t" + computeCommission(salesAmount));
		
		
		}
		
	}
	
	public static double computeCommission(double salesAmount) {
		
		double comission = 0;
		
		if (salesAmount <= 5000) {
			comission = salesAmount * 0.08;
			
		}
		else if (salesAmount > 5000 && salesAmount <= 10000) {
			comission += (5000 * 0.08);
			salesAmount -= 5000;
			comission += salesAmount * 0.10;
		}
		else {
			comission += (5000 * 0.08);
			comission += (5000 * 0.10);
			salesAmount -= 10000;
			
			
			comission += salesAmount * 0.12;
		}
		
		return comission;
		
		
	}

}
