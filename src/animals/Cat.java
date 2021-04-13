package animals;

import common.Gender;

public class Cat extends Animal {

	// The class Cat extends Animal, so it inherits all the attributes and methods

	public Cat(String name, int age, Gender gender) {
		super(name, age, gender);
	}

	// This method will make the adequate noise
	public void makeNoise() {
		System.out.println("Meooww");
	}

	// String formatter for printing the object
	public String toString() {
		return String.format("A %s Cat - Name: %s, Age: %d", this.gender.name().toLowerCase(), this.name, this.age);
	}

}
