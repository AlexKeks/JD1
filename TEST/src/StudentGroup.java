package by.htp.test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentGroup implements GroupOperationService {

	private Student[] students;
	
	public StudentGroup(int length) {
		this.students = new Student[length];

	}

	@Override
	public Student[] getStudents() {
		return students;
		

	}

	@Override
	public void setStudents(Student[] students) {
		if(students==null){
			throw new IllegalArgumentException();
		}
		else
		this.students = students;

	}

	@Override
	public Student getStudent(int index) {
		Student student;
		if(index<0||index>students.length){
			throw new IllegalArgumentException();
		}else
			
		student = students[index];
		return student;

	}

	@Override
	public void setStudent(Student student, int index) {
		students[index] = student;

	}

	@Override
	public void addFirst(Student student) {
		
	}

	@Override
	public void addLast(Student student) {

	}

	@Override
	public void remove(int index) {
		students[index] = null;
	}

	@Override
	public void remove(Student student) {
		int a = student.getId();
		students[a]=null;
	}

	@Override
	public void removeFromIndex(int index) {

	}

	@Override
	public void removeFromElement(Student student) {

	}

	@Override
	public void removeToIndex(int index) {

	}

	@Override
	public void removeToElement(Student student) {

	}

	@Override
	public void bubbleSort() {

	}

	@Override
	public Student[] getByBirthDate(Date date) {
		Student[] stdBD = null;
		int amount = 0;
		for(int i=0;i<students.length;i++){
			if(students[i].getBirthDate()==date){
				amount++;
			}
		}
		stdBD=new Student[amount];
		int j=0;
		for(int i=0;i<students.length;i++){
			if(students[i].getBirthDate()==date){
				stdBD[j]=students[i];
				if(j<stdBD.length){
					j++;
				}
			}
		}
		return stdBD;

	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		Student[] stdBBD = null;
		
		
		
		return stdBBD;

	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {

	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		
		int age = 0;
		Date date = new Date();
		Date d= students[indexOfStudent].getBirthDate();
		
		
		return age;
		
		

	}

	@Override
	public Student[] getStudentsByAge(int age) {

	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {

	}

	@Override
	public Student getNextStudent(Student student) {

	}

	@Override
	public void add(Student student, int index) {

	}

	private int getStudentIndex(Student student) {

	}

	private int getDiffYears(Date first, Date last) {

	}

	private Calendar getCalendar(Date date) {

	}
}