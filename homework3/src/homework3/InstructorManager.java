package homework3;

public class InstructorManager extends UserManager {
	public void add(User user) {
		System.out.println(user.getUserName() + " instructor sisteme giris yapti.");
	}
	
	public void addCourse(Instructor instructor) {
		
		if (instructor.getExperienceYear() > 5) {
			System.out.println("New Course added succesfully.");
			
		}
		else {
			System.err.println("Sorry.You dont have enough experiences");
		}
	}

}
