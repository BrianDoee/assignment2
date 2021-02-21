package homework2;

public class Cat extends Animal implements Scratcher, Domesticated {

	public Cat(String type, String name, int age, String gender, String environment, int speed) {
		super(type, name, age, gender, environment,speed);
	}

	public void walk() {
		System.out.println("Walks");

	}

	public void greetHuman() {
		System.out.println("Meow");
	}
	
	public void scratch() {
		System.out.println("Scratches");
	}

	public String toString() {
		return super.toString();
	}
}
