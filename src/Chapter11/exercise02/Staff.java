package Chapter11.exercise02;

public class Staff extends Person{

	
	
	private String title;

	public Staff() {
		super();
	}

	public Staff(String name, String address, int phoneNumber, String email,String title) {
		super(name, address, phoneNumber, email);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nTitle: " + title;
	}
	

}
