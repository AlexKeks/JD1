package by.htp.comp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		int[] array = new int[] { 9, 8, 15, 9, 25, 3 };
		// Arrays.sort(array);
		// printArray(array);

		String[] sArray = new String[] { "March", "April" };
		// Arrays.sort(sArray);
		// printArray(sArray);

		Person[] pArray = new Person[7];

		Person p1 = new Person(28, "q", 100);
		Person p2 = new Person(103, "pas", 200);
		Person p3 = new Person(4, "w3", 300);
		Person p4 = new Person(58, "pfgdfg4", 400);
		Person p5 = new Person(63, "ap5", 500);
		Person p6 = new Person(24, "c6", 600);
		Person p7 = new Person(21, "b7", 700);

		Person p8 = new Person(21, "q", 800);
		Person p9 = new Person(103, "n9", 900);

		pArray[0] = p1;
		pArray[1] = p2;
		pArray[2] = p3;
		pArray[3] = p4;
		pArray[4] = p5;
		pArray[5] = p6;
		pArray[6] = p7;

		// Arrays.sort(pArray);
		// printArray(pArray);

		HashSet<Person> hashPerson = new HashSet<Person>();
		hashPerson.add(p1);
		hashPerson.add(p2);
		hashPerson.add(p3);
		hashPerson.add(p4);
		hashPerson.add(p5);
		hashPerson.add(p6);
		hashPerson.add(p7);
		hashPerson.add(p8);
		hashPerson.add(p9);

		// for (Person p : hashPerson) {
		// System.out.println(p + " " + p.hashCode());
		// }

		LinkedHashSet<Person> LinkedHashPerson = new LinkedHashSet<Person>();
		LinkedHashPerson.add(p1);
		LinkedHashPerson.add(p2);
		LinkedHashPerson.add(p3);
		LinkedHashPerson.add(p4);
		LinkedHashPerson.add(p5);
		LinkedHashPerson.add(p6);
		LinkedHashPerson.add(p7);
		LinkedHashPerson.add(p8);
		LinkedHashPerson.add(p9);

		// Comparator<Person>p =new PersonAgeComporator2();
		TreeSet<Person> treePerson = new TreeSet<Person>(new PersonAgeComporator2());
		treePerson.add(p1);
		treePerson.add(p2);
		treePerson.add(p3);
		treePerson.add(p4);
		treePerson.add(p5);
		treePerson.add(p6);
		treePerson.add(p7);
		treePerson.add(p8);
		treePerson.add(p9);

		for (Person pp : treePerson)
			System.out.println(pp.getAge() + " " + pp.getBankAmout());

	}

	private static void printArray(Person[] pArray) {
		for (Person p : pArray) {
			System.out.println(p + " ");
		}

	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}
	}

	public static void printArray(String[] sArray) {
		for (int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i] + " ");
		}
	}

}

class Person implements Comparable<Person> {

	int age;
	private String name;
	private int bankAmout;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBankAmout() {
		return bankAmout;
	}

	public void setBankAmout(int bankAmout) {
		this.bankAmout = bankAmout;
	}

	public Person(int age, String name, int bankAmout) {
		super();
		this.age = age;
		this.name = name;
		this.bankAmout = bankAmout;
	}

	public Person() {
		super();

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + "]";
	}

	

	public int compareTo1(Person p) {

		return this.getAge() - p.getAge();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		return true;
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.bankAmout - o.bankAmout;
	}

}

class PersonAgeComporator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {

		return p2.getAge() - p1.getAge();
	}

}

class PersonAgeComporator2 implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {

		int n = p2.compareTo1(p1);
		if (n == 0) {
			return p2.compareTo(p1);
		} else
			return n;
	}
	
	
}

class PersonAgeComporator3 implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {

		//String s = p1.compareTo3(p2);
		int n = p2.compareTo1(p1);
		if (n == 0) {
			return p2.compareTo(p1);
		} else
			return n;
	}
}
