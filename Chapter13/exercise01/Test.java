package Chapter13.exercise01;

import java.util.Scanner;

public class Test {
	
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter three sides of triangle:");
		
		Scanner scan = new Scanner(System.in);
		
		double side1 = scan.nextDouble();
		double side2 = scan.nextDouble();
		double side3 = scan.nextDouble();
		
		System.out.println("Enter color of triangle:");
		String color = scan.next();
		
		System.out.println("Is triangle filled? y/n:");
		char answer = scan.next().charAt(0);
		scan.close();
		boolean isFilled;
			
		if (answer == 'y') {
			isFilled = true;
		}else {
			isFilled = false;
		}
		
		
		Triangle triangle = new Triangle(side1, side2, side3, color, isFilled);
		
		System.out.println(triangle.toString());
		
		
	}

}
