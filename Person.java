package homework2;
/**
 * Person Class
 * @author brian
 *
 */
public class Person {

	public String firstName;
	public String lastName;
	public int age;
	public int socialSecurityNumber;
	public String address;
	public String gender;
	public Double weight;
	/**
	 * Constructor for person class
	 * @param firstName is the first name
	 * @param lastName is the last name
	 * @param age is the age
	 * @param socialSecurityNumber is the social security number
	 * @param address is the address
	 * @param gender is the gender
	 * @param weight is the weight
	 */
	public Person(String firstName, String lastName, int age, int socialSecurityNumber, String address, String gender, Double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.socialSecurityNumber = socialSecurityNumber;
		this.address = address;
		this.gender = gender;
		this.weight = weight;
	}
	/**
	 * 
	 * @param firstName sets the first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * 
	 * @return returns the first name
	 */
	public String  getFirstName( ) {
		return firstName;
	}
	/**
	 * 
	 * @param lastName sets the last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * 
	 * @return returns the last name
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * 
	 * @param age sets the age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * 
	 * @return returns the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * 
	 * @param socialSecurityNumber sets the social security number 
	 */
	public void setSocialSecruityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	/**
	 * 
	 * @return returns the social security number 
	 */
	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	/**
	 * 
	 * @param adress sets the address
	 */
	public void setAddress(String adress) {
		this.address = adress;
	}
	/**
	 * 
	 * @return returns the address 
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 
	 * @param gender sets the gender 
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * 
	 * @return returns the gender 
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * 
	 * @param weight sets the weight 
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
	 * 
	 * @return returns the weight
	 */
	public Double getWeight() {
		return weight;
	}
	@Override
	public String toString() {
		return "First Name : " + firstName + ", Last Name : " + lastName + ", Age : " + age + ", Social Security Number : "
				+ socialSecurityNumber + ", Adress : " + address + ", Gender : " + gender + ", Weight : " + weight  ;
	}
	public void introduce()
	{
	}
}
