package homework2;
import java.io.*;

public class Animal {

	public String type;
	public String name;
	public int age;
	public String gender;
	public String environment;
	public int speed;

	public Animal(String type, String name, int age, String gender, String environment, int speed) {

		this.type = type;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.environment = environment;
		this.speed = speed;
	}
	/**
	 * Gets the type
	 * @return
	 */
	public String getType() {
		return type;
	}
	/** 
	 * Sets the type 
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}
	/** 
	 * Gets the name
	 * @return
	 */
	public String getName() {
		return name;
	}
	/** 
	 *Sets the name 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/** 
	 * Gets the age
	 * @return
	 */
	public int getAge() {
		return age;
	}
	/** 
	 * Sets the age
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/** 
	 * Gets the gender
	 * @return
	 */
	public String getGender() {
		return gender;
	}
	/** 
	 * Sets the gender
	 * @param gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/** 
	 * Gets the environment
	 * @return
	 */
	public String getEnvironment() {
		return environment;
	}
	/** 
	 * Sets the environment
	 * @param environment
	 */
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	/** 
	 * Gets the speed
	 * @return
	 */
	public int getSpeed() {
		return speed;
	}
	/** 
	 * Sets the speed
	 * @param speed
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "Animal Type: " + type + ", Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Environment: "
				+ environment + ", Speed: " + speed + " m/s";
	}




}
