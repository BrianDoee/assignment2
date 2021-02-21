package homework2;
import java.io.*;

/**
 * Tester class for employee
 * @author brian
 *
 */
public class EmployeeTest {

	public static void main(String args[]) {
		//Employee(String firstName, String lastName, int age, int socialSecurityNumber, String address, String gender, Double weight, int empployeeId, String status, Double payAmount)
		Employee employee = new Employee("Joe", "Smith", 30, 141675,"123 Wilcow Road", "male", 60.0, 14, "Contractor", 60.0);
		employee.introduce();
		System.out.println("Gets paid: $" +employee.calculatePay(30.0));
		System.out.println("");

		Employee employee2 = new Employee("Lisa", "Gray", 42, 141251,"412 James Drive", "female", 50.0, 57,"Full time", 110000.0);
		employee2.introduce();
		System.out.println("Gets paid: $" + employee2.calculatePay(2.0));
		System.out.println("");

		Employee employee3 = new Employee("Timothy", "Brags", 26, 999999,"1010 Binary Route", "male", 50.0, 9,"Full time", 8000.0);
		employee3.introduce();
		System.out.println("Gets paid: $" + employee3.calculatePay(4.0));
		System.out.println("");

		Employee employee4 = new Employee("George ", "Wallace", 66, 181818,"900 Empire Avenue", "male", 50.0, 9,"Part time", 20.0);
		employee3.introduce();
		System.out.println("Gets paid: $" + employee4.calculatePay(25.0));
		System.out.println("");


		Employee employee5 = new Employee("Army ", "Student", 21, 000051,"987 Army Road", "male", 50.0, 9,"Contractor", 45.0);
		employee4.introduce();
		System.out.println("Gets paid: $" + employee5.calculatePay(45.0));
		System.out.println("");

	}

}
