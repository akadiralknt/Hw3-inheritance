package homework3;

public class Instructor extends User{
	
	int experienceYear;

	public Instructor(String userName, String userEmail, int experienceYear) {
		super(userName, userEmail);
		this.experienceYear = experienceYear;
	}

	public int getExperienceYear() {
		return experienceYear;
	}

	public void setExperienceYear(int experienceYear) {
		this.experienceYear = experienceYear;
	}

}
