
package homework2;
import java.io.*;
/**
 * 
 * @author brian
 * student class
 */
public class Student {
	public String firstName;
	public String lastName;
	public int age;
	public double gpa;
	public String major;
	public String department;

	/**
	 * Constructor for the Student Class
	 * @param firstName is the first name of the student 
	 * @param lastName is the last name of the student
	 * @param age is the age of the student
	 * @param gpa is the gpa of the student
	 * @param major is the major of the student
	 * @param department is the department of the student
	 */
	public Student(String firstName, String lastName, int age, double gpa, String major, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gpa = gpa;
		this.major = major;
		this.department = department;
	}
	
	/**
	 * 
	 * @return first name
	 */
	public String getFirstName() {
		return  firstName;
	}
	
	/**
	 * 
	 * @param firstName sets first name 
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * 
	 * @return returns last name 
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * 
	 * @param lastName sets last name 
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * 
	 * @return returns age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * 
	 * @param age sets age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * 
	 * @return returns gpa
	 */
	public double getGpa() {
		return gpa;
	}
	
	/**
	 * 
	 * @param gpa sets gpa 
	 */
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	/**
	 * 
	 * @return returns major 
	 */
	public String getMajor() {
		return major;
	}
	
	/**
	 * 
	 * @param major sets major 
	 */
	public void setMajor(String major) {
		this.major = major;
	}
	
	/**
	 * 
	 * @return returns department
	 */
	public String getDepartment() {
		return department;
	}
	
	/**
	 * 
	 * @param department sets department name
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return firstName + " "+  lastName + ", " + age + " year old"+  ", " + gpa +  " gpa"+ ", " + major + " Major" +  ", " + department +" Department"; 
	}

	/**
	 * 
	 * @author brian
	 * Nested class that prints the schedule
	 *
	 */
	public class Course {


		public void printSchedule()

		{
			System.out.println("CS151 Tue/Thur 6-7:15");
		}


	}


}
