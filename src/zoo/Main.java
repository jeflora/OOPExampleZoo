package zoo;

import java.util.ArrayList;
import java.util.List;

import animals.Animal;
import animals.Cat;
import animals.Dog;
import animals.Duck;
import common.Gender;
import common.Utils;

public class Main {

	private final static int ANIMALS_PER_ZOO = 10;

	public static void main(String[] args) {

		int numberOfZoos = Utils.generateRandomNumber(2, 5);

		// initialize and fill the zoos with animals
		List<Zoo> zoos = new ArrayList<>();
		Animal animal = null; // will be used to temporarily store the animals created and will allow to use
								// the last created after the cycle
		for (int i = 0; i < numberOfZoos; i++) {
			Zoo currentZoo = new Zoo(Utils.generateRandomString(20));

			for (int j = 0; j < ANIMALS_PER_ZOO; j++) {
				int specificAnimal = Utils.generateRandomNumber(1, 3);
				switch (specificAnimal) {
				case 1:
					animal = new Cat(Utils.generateRandomString(10), Utils.generateRandomNumber(1, 10),
							Gender.randomGender());
					break;
				case 2:
					animal = new Dog(Utils.generateRandomString(10), Utils.generateRandomNumber(1, 10),
							Gender.randomGender());
					break;
				case 3:
					animal = new Duck(Utils.generateRandomString(10), Utils.generateRandomNumber(1, 10),
							Gender.randomGender());
					break;
				}
				currentZoo.addAnimal(animal);
			}
			zoos.add(currentZoo);
		}

		// print the animal sound
		for (Animal currentAnimal : zoos.get(0).getAnimalsList()) {
			currentAnimal.makeNoise();
		}

		System.out.println();

		// Transfer last animal from the last zoo to the first
		if (zoos.get(numberOfZoos - 1).transferAnimal(animal, zoos.get(0))) {
			System.out.println(animal + " transferred from " + zoos.get(numberOfZoos - 1) + " to " + zoos.get(0));
		}

		System.out.println();

		// Transfer new animal from the last zoo to the first
		Animal aDog = new Dog("Bolinhas", 10, Gender.MALE);
		if (zoos.get(numberOfZoos - 1).transferAnimal(aDog, zoos.get(0))) {
			System.out.println(aDog + " transferred from " + zoos.get(numberOfZoos - 1) + " to " + zoos.get(0));
		} else {
			System.out.println("The animal " + aDog + " is not in the " + zoos.get(numberOfZoos - 1));
			zoos.get(numberOfZoos - 1).addAnimal(aDog);
		}
	}
}
