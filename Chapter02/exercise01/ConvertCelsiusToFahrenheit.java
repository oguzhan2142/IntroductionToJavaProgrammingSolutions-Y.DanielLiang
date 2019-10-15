package Chapter02.exercise01;

import java.util.Scanner;

public class ConvertCelsiusToFahrenheit {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		
		double celsius = scan.nextDouble();
		
		double fahrenheit = (9.0 / 5.0) * celsius + 32 ; 
		
		
		System.out.println(fahrenheit);
		scan.close();
	}

}
