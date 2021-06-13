package homework3;

public class Student extends User {
	
	int studentId;
	double studentScore;
	
	public Student(String userName, String userEmail, int studentId, double studentScore) {
		super(userName, userEmail);
		this.studentId = studentId;
		this.studentScore = studentScore;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public double getStudentScore() {
		return studentScore;
	}

	public void setStudentScore(double studentScore) {
		this.studentScore = studentScore;
	}

}
