package Chapter02.exercise23;

import java.util.Scanner;

public class CostOfDriving {

	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double distanceToDrive = scan.nextDouble();
		double milesPerGallon = scan.nextDouble();
		double pricePerGallon = scan.nextDouble();
		
		
		double cost = (distanceToDrive / milesPerGallon) * pricePerGallon ;
		
		System.out.println(cost);
		scan.close();
		
		
	}
}
