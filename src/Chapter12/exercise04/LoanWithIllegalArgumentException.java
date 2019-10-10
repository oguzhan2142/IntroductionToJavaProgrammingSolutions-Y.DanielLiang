package Chapter12.exercise04;

public class LoanWithIllegalArgumentException {
	private double annualInterestRate;
	  private int numberOfYears;
	  private double loanAmount;
	  private java.util.Date loanDate;

	  /** Default constructor */
	  public LoanWithIllegalArgumentException() {
	    this(2.5, 1, 1000);
	  }

	  /** Construct a loan with specified annual interest rate,
	      number of years and loan amount 
	    */
	  public LoanWithIllegalArgumentException (double annualInterestRate, int numberOfYears,
	      double loanAmount) {
		  
		setAnnualInterestRate(annualInterestRate);
		setNumberOfYears(numberOfYears);
		setLoanAmount(loanAmount);
	    loanDate = new java.util.Date();
	  }

	  /** Return annualInterestRate */
	  public double getAnnualInterestRate() {
	    return annualInterestRate;
	  }

	  /** Set a new annualInterestRate */
	  public void setAnnualInterestRate(double annualInterestRate) {
		  if (annualInterestRate > 0) {
			
			  this.annualInterestRate = annualInterestRate;
		} else {
			throw new IllegalArgumentException("annual interest rate cannot be " + annualInterestRate);
		}
	  }

	  /** Return numberOfYears */
	  public int getNumberOfYears() {
	    return numberOfYears;
	  }

	  /** Set a new numberOfYears */
	  public void setNumberOfYears(int numberOfYears) {
		  if (numberOfYears > 0) {
			  this.numberOfYears = numberOfYears;
			
		} else {
			throw new IllegalArgumentException("number of years cannot be " + numberOfYears) ; 
		}
	  }

	  /** Return loanAmount */
	  public double getLoanAmount() {
	    return loanAmount;
	  }

	  /** Set a newloanAmount */
	  public void setLoanAmount(double loanAmount) {
		  if (loanAmount > 0) {
			  this.loanAmount = loanAmount;
		}else {
			throw new IllegalArgumentException("loan amout cannot be " + loanAmount);
		}
	  }

	  /** Find monthly payment */
	  public double getMonthlyPayment() {
	    double monthlyInterestRate = annualInterestRate / 1200;
	    double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
	      (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
	    return monthlyPayment;    
	  }

	  /** Find total payment */
	  public double getTotalPayment() {
	    double totalPayment = getMonthlyPayment() * numberOfYears * 12;
	    return totalPayment;    
	  }

	  /** Return loan date */
	  public java.util.Date getLoanDate() {
	    return loanDate;
	  }
}
