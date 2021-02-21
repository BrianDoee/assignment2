package homework2;

public class Dog extends Animal implements Domesticated {

	public Dog(String type, String name, int age, String gender, String environment, int speed) {
		super(type, name, age, gender, environment, speed);

	}

	public void walk() {
		System.out.println("Walks");

	}
	public void greetHuman()
	{
		System.out.println("Woof");
	}
	
	public String toString() {
		return super.toString();
	}
}
