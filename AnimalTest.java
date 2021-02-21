package homework2;

public class AnimalTest {
	
	public static void main(String args[]) {
		
		Cat cat = new Cat("Cat", "Beanz", 4, "Female", "Garage", 12);
		System.out.println(cat);
		cat.scratch();
		cat.greetHuman();
		System.out.println("");
		
		Dog dog = new Dog("Dog", "Plato", 9, "Male", "Doghouse", 10);
		System.out.println(dog);
		dog.walk();
		dog.greetHuman();
		System.out.println("");
		
		Whale whale = new Whale("Whale", "Balooga", 22, "Female", "Atlantic Ocean", 35);
		System.out.println(whale);
		whale.swim();
		whale.greetHuman();
		System.out.println("");
		
		Racoon racoon = new Racoon("Racoon", "Thief", 8, "Male", "Trashcan", 7);
		System.out.println(racoon);
		racoon.scratch();
		racoon.walk();
		System.out.println("");
	}

}
