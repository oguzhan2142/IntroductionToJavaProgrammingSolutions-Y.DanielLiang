package Chapter12.exercise04;

public class Test {

	public static void main(String[] args) {

		
		LoanWithIllegalArgumentException loan = new LoanWithIllegalArgumentException(0, 0, 300);
		
		System.out.println(loan.getAnnualInterestRate());
		System.out.println(loan.getTotalPayment());
		System.out.println(loan.getAnnualInterestRate());
	}

}
