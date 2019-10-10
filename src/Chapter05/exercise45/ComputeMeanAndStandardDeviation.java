package Chapter05.exercise45;

import java.util.Scanner;

public class ComputeMeanAndStandardDeviation {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		double numSum = 0;
		int numAmount = 0;
		double mean ;
		double standartDeviation;
		double numTwoPowerSum = 0;
		
		for (int i = 0; i < 10; i++) {
			
			double takeNum = scan.nextDouble();
			numSum += takeNum;
			numTwoPowerSum += Math.pow(takeNum, 2);
			numAmount++;
			
		}
		
		scan.close();
		
		mean = numSum / numAmount;
		
		System.out.println("The mean is " + mean);
		
		standartDeviation = Math.sqrt((numTwoPowerSum - (Math.pow(numSum, 2) / numAmount)) / (numAmount - 1) ) ; 
		
		
		System.out.println("The standart deviation is " + standartDeviation);
		
		
		
		
	}

}
