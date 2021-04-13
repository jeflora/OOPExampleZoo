package animals;

import common.Gender;

public abstract class Animal implements Comparable<Animal> {

	protected String name; // holds the name of the animal
	protected int age; // holds the age of the animal
	protected Gender gender; // holds the gender of the animal

	// Constructor
	public Animal(String name, int age, Gender gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	// This method is defined as abstract so the implementation must be defined in
	// subclasses
	public abstract void makeNoise();

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	// -----------------------

	// String formatter for printing the object
	public String toString() {
		return String.format("Animal - Name: %s, Age: %d, Gender: %s", this.name, this.age,
				this.gender.name().toLowerCase());
	}

	// Method to compare different animals with regard to the age
	// It overrides the method from the Comparable Interface
	public int compareTo(Animal otherAnimal) {
		if (this.age < otherAnimal.age) {
			return -1;
		} else if (this.age == otherAnimal.age) {
			return 0;
		} else {
			return 1;
		}
	}

	// This method overrides the Object class equals method
	// It allows us to directly compare instances of Animal
	public boolean equals(Object o) {
		// If the object is compared with itself then return true
		if (o == this) {
			return true;
		}

		// Check if o is an instance of Animal
		if (!(o instanceof Animal)) {
			return false;
		}

		// typecast o to Animal so that we can compare data members
		Animal otherAnimal = (Animal) o;
		return this.name.equals(otherAnimal.getName()) && this.age == otherAnimal.age
				&& this.gender == otherAnimal.gender;
	}

}
