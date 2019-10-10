package Chapter11.exercise02;

public class Student extends Person {

	public final static int FRESHMAN = 1;
	public final static int SOPHOMORE = 2;
	public final static int JUNIOR = 3;
	public final static int SENIOR = 4;

	private int status;

	public Student() {
		super();
	}

	public Student(String name, String address, int phoneNumber, String email, int status) {
		super(name, address, phoneNumber, email);
		this.status = status;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String toString() {
		return super.toString() + "\nStatus: " + getStatus();
	}

}
