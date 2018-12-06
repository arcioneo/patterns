package factory;

import beans.Circle;
import beans.Shape;
import beans.Square;
import beans.Triangle;
import definitions.ShapeType;

public class ShapeFactory {

	public Shape getShape(ShapeType shapeType) {
		switch (shapeType) {
			case CIRCLE:
				return new Circle();
			case SQUARE:
				return new Square();
			case TRIANGLE:
				return new Triangle();
			default:
				return new Circle();
		}
	}
}
