package by.htp.oop;

public class Teacher extends Person {

	private int experiens;

	public int getExperiens() {
		return experiens;
	}

	public void setExperiens(int experiens) {
		this.experiens = experiens;
	}

	public String doSmthTeacher() {

		return "I'm a teacher!";

	}

	public String saySmth() {

		return "I'm very tired";
	}

	@Override
	public String doSmth() {
		
		return "I'm a teacher!";
	}
	
	public String toString(){
		return "Teacher [experiens="+experiens+"]";
		
	}

}
