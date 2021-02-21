package homework2;
import java.io.*;

public class Employee extends Person {
	public int employeeId;
	public String employeeStatus;
	public Double payAmount;

	/**
	 * Constructor for super employee class
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param socialSecurityNumber
	 * @param address
	 * @param gender
	 * @param weight
	 * @param empployeeId
	 * @param employeeStatus
	 * @param payAmount
	 */
	public Employee(String firstName, String lastName, int age, int socialSecurityNumber, String address, String gender, Double weight, int empployeeId, String employeeStatus, Double payAmount) {
		super(firstName, lastName, age, socialSecurityNumber, address, gender, weight);

		this.employeeId = employeeId;
		this.employeeStatus = employeeStatus;
		this.payAmount = payAmount;

	}
	/**
	 * Gets employee id
	 * @return returns employee id
	 */
	public int getEmployeeId() {
		return employeeId;
	}
	/**
	 * Sets employee id
	 * @param employeeId
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * Gets employee status
	 * @return returns status 
	 */
	public String getEmployeeStatus() {
		return employeeStatus;
	}
	/**
	 * Sets employee status
	 * @param employeeStatus
	 */
	public void setEmployeeStatus(String employeeStatus) {
		this.employeeStatus = employeeStatus;
	}
	/**
	 * Gets the paid amount for employee
	 * @return returns pay amount 
	 */
	public double getPayAmount() {
		return payAmount;
	}
	/**
	 * Sets amount paid to employee
	 * @param payAmount
	 */
	public void setPayAmount(Double payAmount) {
		this.payAmount = payAmount;
	}
	/**
	 * Calculates pay for each employee
	 * @param time decides how much employee is paid due to time worked
	 * @return returns the pay for employee
	 */
	public double calculatePay(Double time) {

		if(this.employeeStatus.equals("Full time")){
			return this.payAmount*1/52*time;
		}
		else {
			return this.payAmount*(time);
		}

	}

	@Override
	public void introduce() {
		System.out.println(super.toString() + employeeId + ", " + employeeStatus + ", " + payAmount);
	}



}
