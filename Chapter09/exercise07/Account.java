package Chapter09.exercise07;

import java.util.Date;

public class Account {

	private int id;
	private double balance;
	private double annualInterestRate; // like %4.5 devide it with 100
	private Date dateCreated;

	public Account() {

		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();

	}

	public Account(int id, double balance) {

		this.id = id;
		this.balance = balance;
		annualInterestRate = 0;
		dateCreated = new Date();

	}

	public double getMonthlyInterestRate() {

		return annualInterestRate / (12);

	}

	public double getMonthlyInterest() {

		return balance * (getMonthlyInterestRate() /100);

	}

	public void withdraw(double amount) {

		balance = balance - amount;

	}

	public void deposit(double amount) {

		balance = balance + amount;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	
	
	
	
	public static void main(String[] args) {
		
		
		
		
		Account account = new Account(1122, 20000);
		account.setAnnualInterestRate(4.5);
		
		account.withdraw(2500);
		account.deposit(3000);
		
		
		System.out.println(account.getBalance());
		System.out.println(account.getMonthlyInterest());
		System.out.println(account.getDateCreated());
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
