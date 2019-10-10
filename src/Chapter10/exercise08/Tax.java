package Chapter10.exercise08;

public class Tax {
	
	public static int SINGLE_FILER = 0;
	public static int MARRIED_JOINTLY_OR_WIDOW = 1;
	public static int MARRIED_SEPERATELY = 2;
	public static int HEAD_OF_HOUSEHOLD = 3;
	
	int filingStatus;


	int[][] brackets;
	double [] rates;
	double taxableIncome;
	
	
	public Tax() {
	}
	
		
	public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
		this.filingStatus = filingStatus;
		this.brackets = brackets;
		this.rates = rates;
		this.taxableIncome = taxableIncome;
	}
	
	
	
	
	
	
	
	
	
	
	public double getTax() {
		return 0;
	}


	public int[][] getBrackets() {
		return brackets;
	}


	public void setBrackets(int[][] brackets) {
		this.brackets = brackets;
	}


	public void setFilingStatus(int filingStatus) {
		this.filingStatus = filingStatus;
	}


	public void setRates(double[] rates) {
		this.rates = rates;
	}


	public void setTaxableIncome(double taxableIncome) {
		this.taxableIncome = taxableIncome;
	}
		
		
		
	

}
