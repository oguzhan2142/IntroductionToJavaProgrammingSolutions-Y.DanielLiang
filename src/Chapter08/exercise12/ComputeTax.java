package Chapter08.exercise12;

import java.util.Scanner;

public class ComputeTax {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);

	    // Prompt the user to enter filing status
	    System.out.print(
	      "(0-single filer, 1-married jointly,\n" +
	      "2-married separately, 3-head of household)\n" +
	      "Enter the filing status: ");
	    int status = scan.nextInt();

	    // Prompt the user to enter taxable income
	    System.out.print("Enter the taxable income: ");
	    double income = scan.nextDouble();
	    scan.close();
	    // Compute tax
	    double tax = 0;
	    double[] rates = {0.10 , 0.15 , 0.25 , 0.28 , 0.33 , 0.35};
	    int[][] brackets = { 
	    		{8350, 33950, 82250, 171550, 372950} ,
	    		{16700, 67900, 137050, 20885, 372950},
	    		{8350, 33950, 68525, 104425, 186475},
	    		{11950, 45500, 117450, 190200, 372950}
	    } ;
	    
	    
	    
	    if (status == 0) { // Compute tax for single filers
	      if (income <= brackets[0][0])
	        tax = income * rates[0];
	      else if (income <= brackets[0][1])
	        tax = brackets[0][0] * rates[0] + (income - brackets[0][0]) * rates[1];
	      else if (income <= brackets[0][2])
	        tax = brackets[0][0] * rates[0] + (brackets[0][1] - brackets[0][0]) * rates[1] +
	          (income - 33950) * rates[2];
	      else if (income <= brackets[0][3])
	        tax = brackets[0][0] * rates[0] + (brackets[0][1] - brackets[0][0]) * rates[1] +
	          (brackets[0][2] - brackets[0][1]) * rates[2] + (income - brackets[0][2]) * rates[3];
	      else if (income <= brackets[0][4])
	        tax = brackets[0][0] * rates[0] + (brackets[0][1] - brackets[0][0]) * rates[1]+
	          (brackets[0][2] - brackets[0][1]) * rates[2] + (brackets[0][3] - brackets[0][2]) * rates[3]+
	          (income - brackets[0][3]) * rates[4];
	      else
	        tax = brackets[0][0] * rates[0] + (brackets[0][1] - brackets[0][0]) * rates[1]+
	          (brackets[0][2] - brackets[0][1]) * rates[2]+ (brackets[0][3] - brackets[0][2]) * rates[3]+
	          (brackets[0][4] - brackets[0][3]) * rates[4]+ (income - brackets[0][4]) * rates[5];
	    }
	    else if (status == 1) { // Compute tax for married file jointly
	      // Left as exercise
	    }
	    else if (status == 2) { // Compute tax for married separately
	      // Left as exercise
	    }
	    else if (status == 3) { // Compute tax for head of household
	      // Left as exercise
	    }
	    else {
	      System.out.println("Error: invalid status");
	      System.exit(0);
	    }

	    // Display the result
	    System.out.println("Tax is " + (int)(tax * 100) / 100.0);
		
		
		
		
		
	}

}
