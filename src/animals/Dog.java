package animals;

import common.Gender;

public class Dog extends Animal {

	// The class Dog extends Animal, so it inherits all the attributes and methods

	public Dog(String name, int age, Gender gender) {
		super(name, age, gender);
	}

	// This method will make the adequate noise
	public void makeNoise() {
		System.out.println("oof oof");
	}

	// String formatter for printing the object
	public String toString() {
		return String.format("A %s Dog - Name: %s, Age: %d", this.gender.name().toLowerCase(), this.name, this.age);
	}

}
