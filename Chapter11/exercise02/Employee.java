package Chapter11.exercise02;

import Chapter10.exercise14.MyDate;

public class Employee extends Person {

	private String office;
	private int salary;
	private MyDate dateHired;

	public Employee() {
		super();
	}

	public Employee(String name, String address, int phoneNumber, String email, String office, int salary) {
		super(name, address, phoneNumber, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = new MyDate();

	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	

	@Override
	public String toString() {
		return super.toString() + "\nOffice: " + office + "\nSalary: $" + getSalary() + "\nDate hired: "
				+ getDateHired();

	}

	public MyDate getDateHired() {
		return dateHired;
	}

	public void setDateHired(MyDate dateHired) {
		this.dateHired = dateHired;
	}
}
