package client;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Before;
import org.junit.Test;

import beans.Circle;
import beans.Square;
import beans.Triangle;
import definitions.ShapeType;
import factory.ShapeFactory;

public class Client {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		ShapeFactory shapeFactory = new ShapeFactory();

		assertThat(shapeFactory.getShape(ShapeType.CIRCLE), IsInstanceOf.instanceOf(Circle.class));
		assertThat(shapeFactory.getShape(ShapeType.TRIANGLE), IsInstanceOf.instanceOf(Triangle.class));
		assertThat(shapeFactory.getShape(ShapeType.SQUARE), IsInstanceOf.instanceOf(Square.class));

	}

}
