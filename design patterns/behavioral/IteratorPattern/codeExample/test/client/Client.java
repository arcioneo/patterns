package client;

import org.junit.Before;
import org.junit.Test;

import bean.Animal;
import collection.IZoo;
import collection.Zoo;
import iterator.Iterator;

public class Client {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		IZoo zoo = new Zoo();
		zoo.addAnimal(new Animal("Tiger", "Wild"));
		zoo.addAnimal(new Animal("Lion", "Wild"));
		zoo.addAnimal(new Animal("Tom Cat", "Domestic"));
		zoo.addAnimal(new Animal("Raging Bull", "Wild"));
		zoo.addAnimal(new Animal("Scooby Doo", "Domestic"));

		Iterator wildIterator = zoo.getIterator("Wild");
		while (!wildIterator.isLastAnimal()) {
			System.out.println("Wild Animal: " + wildIterator.nextAnimal().getName());
		}

		Iterator domesticIterator = zoo.getIterator("Domestic");
		while (!domesticIterator.isLastAnimal()) {
			System.out.println("Domestic Animal: " + domesticIterator.nextAnimal().getName());
		}
	}

}
