package zoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import animals.Animal;

public class Zoo {

	private String name;
	private List<Animal> animalsList;

	public Zoo(String name) {
		this.name = name;
		this.animalsList = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Animal> getAnimalsList() {
		return animalsList;
	}

	public void setAnimalsList(List<Animal> animalsList) {
		this.animalsList = animalsList;
	}

	public void addAnimal(Animal animal) {
		this.animalsList.add(animal);
	}

	public boolean transferAnimal(Animal animalToTranfer, Zoo destinationZoo) {
		int animalIndex = this.animalsList.indexOf(animalToTranfer);
		if (animalIndex != -1) {
			this.animalsList.remove(animalIndex);
			destinationZoo.addAnimal(animalToTranfer);
		}
		return animalIndex != -1; // if the animal was in `this` zoo it was transferred
	}

	public String toString() {
		return "Zoo: " + this.name;
	}

	public void printAnimalList() {
		System.out.println("------------------------------");
		for(Animal animal : this.animalsList) {
			System.out.println(animal);
		}
		System.out.println("------------------------------");
	}
	
	public void sortAnimalsPerAge() {
		Collections.sort(this.animalsList);
	}
}
