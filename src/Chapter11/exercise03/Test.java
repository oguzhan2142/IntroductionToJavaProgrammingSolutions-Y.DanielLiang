package Chapter11.exercise03;

public class Test {
	
	
	
	
public static void main(String[] args) {
	Account account = new Account(1, 3000);
	SavingAccount savingAccount = new SavingAccount(2, 4000);
	CheckingAccount checkingAccount = new CheckingAccount(3, 5000, 3000);
	
	
	System.out.println(account.toString());
	System.out.println(savingAccount.toString());
	System.out.println(checkingAccount.toString());
	
}
}
