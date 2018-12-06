package iterator;

import java.util.List;

import bean.Animal;

public class DomesticIterator implements Iterator {

	List<Animal>	animalList;
	private int		position;

	public DomesticIterator(List<Animal> animalList) {
		this.animalList = animalList;
	}

	public Animal nextAnimal() {
		Animal animal = null;
		for (; position < animalList.size(); position++) {
			if ("Domestic".equals((animalList.get(position)).getType())) {
				animal = animalList.get(position);
				position++;
				break;
			}
		}
		return animal;
	}

	public boolean isLastAnimal() {
		for (int i = position; i < animalList.size(); i++) {
			if ("Domestic".equals((animalList.get(i)).getType())) {
				return false;
			}
		}
		return true;
	}

	public Animal currentAnimal() {
		if (position < animalList.size()) {
			return animalList.get(position);
		}
		return null;
	}

}
