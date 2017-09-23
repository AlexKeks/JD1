package by.htp.oop;

public class Worker extends Person {

	private String speciality;

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String doSmthWorker() {

		return "I'm a worker!";

	}

	public String saySmth() {

		return "I'm angry";
	}

	@Override
	public String doSmth() {
		
		return "I'm a worker!";
	}

	@Override
	public String toString() {
		return "Worker [speciality=" + speciality + ", getFio()=" + getFio() + ", getAge()=" + getAge() + "]";
	}
}
