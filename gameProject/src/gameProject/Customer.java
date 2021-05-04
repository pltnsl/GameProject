package gameProject;

public class Customer {
	private int id;
	private String NationalityId;
	private String firstName;
	private String lastName;
	private String yearofBirth;
	private boolean status;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getYearofBirth() {
		return yearofBirth;
	}
	public void setYearofBirth(String yearofBirth) {
		this.yearofBirth = yearofBirth;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

}
