package homework3;

public class Main {

	public static void main(String[] args) {
		
		User user = new User("myName", "myEmail@mail.com");
		
		
		Student student = new Student("studentName", "student@mail.com", 1, 55.5);
		
		Instructor instructor1 = new Instructor("instructor1", "instructor1@mail.com", 4);
		Instructor instructor2 = new Instructor("instructor2", "instructor2@mail.com", 6);
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(user);
		studentManager.addScore(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(instructor1);
		instructorManager.addCourse(instructor2);
		
		
		
		

	}

}
