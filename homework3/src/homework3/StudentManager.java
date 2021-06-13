package homework3;

public class StudentManager extends UserManager {
	public void add(User user) {
		System.out.println(user.userName + " student sisteme giris yapti.");
	}
	
	public void addScore(Student student) {
		System.out.println("Score of " + student.studentId +" : " + student.studentScore);
	}
}
