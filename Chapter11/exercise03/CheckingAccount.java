package Chapter11.exercise03;

public class CheckingAccount extends Account{
	
	private double overdraftLimit;

	public CheckingAccount() {
		super();
	}

	public CheckingAccount(int id, double balance,double overdraftLimit) {
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public void withdraw(double amount) {
		if (amount < getBalance()) {
			
			super.withdraw(amount);
		}else {
			System.err.println("error");
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " \noverdraft limit:$" + overdraftLimit;
	}
	

}
