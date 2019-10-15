package Chapter11.exercise08;

public class Test {

	public static void main(String[] args) {

		Account george = new Account(1122, "George", 1000);
		george.deposit(30);
		george.deposit(40);
		george.deposit(50);
		george.withdraw(5);
		george.withdraw(4);
		george.withdraw(2);
		
		
		System.out.println("name:" + george.getName() + " interestRate:" + george.getAnnualInterestRate() + " balance:" + george.getBalance() );
		
		for (int i = 0; i <george.getTransactions().size(); i++) {
			System.out.println(george.getTransactions().get(i));
		}
		
		
	}

}
