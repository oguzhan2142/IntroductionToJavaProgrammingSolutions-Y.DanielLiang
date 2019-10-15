package Chapter11.exercise03;

public class SavingAccount extends Account {


	
	

	public SavingAccount() {
		super();
	}

	public SavingAccount(int id, double balance) {
		super(id, balance);
	}

	@Override
	public void withdraw(double amount) {
		if (amount < getBalance()) {

			super.withdraw(amount);
		} else {
			System.err.println("error");
		}
	}

}
