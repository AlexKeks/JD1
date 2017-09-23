package by.htp.oop;

public abstract class Person {

	private String fio;
	private int age;

	public String getFio() {
		return fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/*public String doSmth() {

		return "I'm a person!";

	}

	public String saySmth() {

		return "I'm hungry";
	}*/
	
	public abstract String doSmth();
	public abstract String saySmth();
}
