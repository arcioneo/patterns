package collection;

import java.util.List;

import bean.Animal;
import iterator.Iterator;

public interface IZoo {
	List<Animal> getAnimals();

	void addAnimal(Animal animal);

	void removeAnimal(Animal animal);

	Iterator getIterator(String IteratorType);

}
