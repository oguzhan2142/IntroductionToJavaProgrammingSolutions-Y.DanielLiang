package Chapter02.exercise02;

import java.util.Scanner;

public class ComputeTheVolumeOfACylinder {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
				
		double radius = scan.nextDouble();
		scan.delimiter();
		double length = scan.nextDouble();
		
		double area = (radius * radius * Math.PI); 
		double volume = area * length;
		
		
		System.out.println("area:" + area);
		System.out.println("volume" + volume);
		scan.close();
	}

}
