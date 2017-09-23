package by.htp.oop;

public class Student extends Person {

	private String course;

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String doSmthStudent() {

		return "I'm a student!";

	}

	public String saySmth() {

		return "I'm tired";
	}

	@Override
	public String doSmth() {
		
		return "I'm a student!";
	}

	@Override
	public String toString() {
		return "Student [course=" + course + ", getCourse()=" + getCourse() + "]";
	}
}
