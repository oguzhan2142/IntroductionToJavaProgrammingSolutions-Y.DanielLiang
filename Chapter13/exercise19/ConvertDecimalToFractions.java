package Chapter13.exercise19;

import java.math.BigInteger;
import java.util.Scanner;

import Chapter13.exercise15.BigRational;

public class ConvertDecimalToFractions {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a decimal number(ex:3,25):");

		String decimal = scan.nextLine();
		scan.close();

		String[] parts = decimal.split(",");
		
		BigRational beforeDot = new BigRational(new BigInteger(parts[0]), new BigInteger("1"));

		String denominator = "1";
		for (int i = 0; i < parts[1].length() ; i++) {
			denominator += "0";
		}
		
		BigRational afterDot = new BigRational(new BigInteger(parts[1]), new BigInteger(denominator));
		
		BigRational finalRational = beforeDot.add(afterDot);
		
		
		System.out.println(finalRational);
		
	}

}
