package iterator;

import bean.Animal;

public interface Iterator {
	Animal nextAnimal();

	boolean isLastAnimal();

	Animal currentAnimal();
}
