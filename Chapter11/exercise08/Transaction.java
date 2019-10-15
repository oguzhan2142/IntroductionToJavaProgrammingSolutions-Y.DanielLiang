package Chapter11.exercise08;

import java.util.Date;

public class Transaction {

	public static final char WITHDRAWAL = 'W';
	public static final char DEPOSIT = 'D';
	
	private Date date;
	private char type;
	
	private double amount;
	private double balance;
	private String description;
	
	public Transaction(Date date, char type, double amount, double balance, String description) {
		this.date = date;
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}

	
	
	
	@Override
	public String toString() {
		return "date:" + getDate() + " amount:" +  getAmount() + " descroption:" + getDescription();
	}
	
	
	

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
