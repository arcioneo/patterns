package com;

import colors.Color;

public abstract class Shape {
	protected Color color;

	public Shape(Color color) {
		super();
		this.color = color;
	}

	abstract public void applyColor();

}
