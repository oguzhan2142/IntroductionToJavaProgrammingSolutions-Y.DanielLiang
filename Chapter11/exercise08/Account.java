package Chapter11.exercise08;

import java.util.ArrayList;
import java.util.Date;

public class Account extends Chapter09.exercise07.Account {

	private String name;
	private ArrayList<Transaction> transactions;

	public Account() {
		super();
	}

	public Account(int id, String name, double balance) {
		super(id, balance);
		this.name = name;
		transactions = new ArrayList<Transaction>();
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		super.withdraw(amount);
		transactions.add(new Transaction(new Date(), Transaction.WITHDRAWAL, amount, getBalance(), "withdraw"));
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		super.deposit(amount);
		transactions.add(new Transaction(new Date(), Transaction.DEPOSIT, amount, getBalance(), "deposit"));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}

}
