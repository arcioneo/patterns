package client;

import org.junit.Before;
import org.junit.Test;

import com.Shape;

import colors.GreenColor;
import colors.RedColor;
import shapes.Circle;
import shapes.Triangle;

public class Client {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Shape triangle = new Triangle(new GreenColor());
		Shape circle = new Circle(new RedColor());

		triangle.applyColor();
		circle.applyColor();

	}

}
