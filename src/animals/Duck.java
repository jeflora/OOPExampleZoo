package animals;

import common.Gender;

public class Duck extends Animal {

	// The class Duck extends Animal, so it inherits all the attributes and methods

	public Duck(String name, int age, Gender gender) {
		super(name, age, gender);
	}

	// This method will make the adequate noise
	public void makeNoise() {
		System.out.println("quack quack");
	}

	// String formatter for printing the object
	public String toString() {
		return String.format("A %s Duck - Name: %s, Age: %d", this.gender.name().toLowerCase(), this.name, this.age);
	}

}
