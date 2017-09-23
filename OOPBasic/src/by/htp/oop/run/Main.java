package by.htp.oop.run;

import by.htp.oop.Person;
import by.htp.oop.Student;
import by.htp.oop.Teacher;
import by.htp.oop.Worker;

public class Main {

	public static void main(String[] args) {

		/*
		 * Person p = new Person(); p.setAge(10);
		 * p.setFio("Person Person1 Person11");
		 * 
		 * System.out.println(p.getFio()); System.out.println(p.getAge());
		 */

		Student st = new Student();
		st.setAge(27);
		st.setFio("EM A S");
		st.setCourse("Java Basic");

		System.out.println(st.getFio());
		System.out.println(st.getAge());
		System.out.println(st.getCourse());

		Teacher t = new Teacher();
		t.setAge(25);
		t.setFio("Svetlana");
		t.setExperiens(11);

		System.out.println(t.getFio());
		System.out.println(t.getAge());
		System.out.println(t.getExperiens());

		Worker w = new Worker();
		w.setFio("Worker1 W");
		w.setAge(40);
		w.setSpeciality("Metodist");

		System.out.println(w.getFio());
		System.out.println(w.getAge());
		System.out.println(w.getSpeciality());

		Person[] persons = new Person[3];
		// persons[0] = p;
		persons[0] = st;
		persons[1] = t;
		persons[2] = w;

		
		/*for (Person person : persons) {

			if (person.getClass().equals(Student.class)) {

				Student st1 = (Student) person;
				System.out.println(st1.doSmthStudent());
			} else if (person.getClass().equals(Teacher.class)) {

				Teacher th1 = (Teacher) person;
				System.out.println(th1.doSmthTeacher());
			} else if (person.getClass().equals(Worker.class)) {

				Worker w1 = (Worker) person;
				System.out.println(w1.doSmthWorker());
			} /*
				 * else if (person.getClass().equals(Person.class)) {
				 * 
				 * System.out.println(person.doSmth());
				 * 
				 * }
				 */
		

		for (int i = 0; i < persons.length; i++) {

			System.out.println(persons[i].saySmth());
			System.out.println(persons[i].toString());
		}

	}

}
