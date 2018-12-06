package collection;

import java.util.ArrayList;
import java.util.List;

import bean.Animal;
import iterator.DomesticIterator;
import iterator.Iterator;
import iterator.WildIterator;

public class Zoo implements IZoo {

	List<Animal> animalList;

	public Zoo() {
		animalList = new ArrayList<Animal>();
	}

	public List<Animal> getAnimals() {
		return animalList;
	}

	public void addAnimal(Animal animal) {
		animalList.add(animal);
	}

	public void removeAnimal(Animal animal) {
		animalList.remove(animal);
	}

	public Iterator getIterator(String iteratorType) {
		if ("Wild".equals(iteratorType)) {
			return new WildIterator(animalList);
		} else {
			return new DomesticIterator(animalList);
		}
	}

}
