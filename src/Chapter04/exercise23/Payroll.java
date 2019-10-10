package Chapter04.exercise23;

import java.util.Scanner;

public class Payroll {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter employee's name:");
		String name = scan.next();
		System.out.println("Enter number of hours worked in a week:");
		double hoursWorked = scan.nextDouble();
		System.out.println("Enter hourly pay rate:");
		double hourlyPayRate = scan.nextDouble();
		System.out.println("Enter federal tax withholding rate:");
		double federalTax = scan.nextDouble();
		System.out.println("Enter state tax withholding rate:");
		double stateTax = scan.nextDouble();
		
		scan.close();
		
		double grossPay = hourlyPayRate * hoursWorked;
		
		System.out.println("Employee Name:" + name);
		System.out.println("Hours Worked:" + hoursWorked);
		System.out.println("Pay Rate:" + "$" + hourlyPayRate);
		System.out.println("Gross Pay:$" + (grossPay) );
		System.out.println("Deductions:");
		System.out.println("\tFederal Withholding:$" + (grossPay * federalTax));
		System.out.println("\tState Withholding:$" + (grossPay * stateTax));
		System.out.println("\tTotal Deduction:$" + ((grossPay * stateTax) + (grossPay * federalTax)));
		System.out.println("Net Pay:$" + (grossPay - (grossPay * stateTax) - (grossPay * federalTax)));
		
		
		
	}

}
