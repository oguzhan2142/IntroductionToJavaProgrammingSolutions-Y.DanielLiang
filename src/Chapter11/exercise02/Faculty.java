package Chapter11.exercise02;

public class Faculty extends Person{

	
	private int officeHours;
	private String rank;

	
	
	public Faculty() {
		super();
	}
	public Faculty(String name, String address, int phoneNumber, String email,int officeHours , String rank) {
		super(name, address, phoneNumber, email);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public int getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(int officeHours) {
		this.officeHours = officeHours;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nOffice hours: " + officeHours +
				"\nRank: " + rank;
	}
	
	

}
