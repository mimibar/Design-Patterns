package com.designpatterns.creational.builder;

import java.awt.Color;

/**
 * The Product
 */
public class AnyShape {
	public enum Type {
		CIRCLE, SQUARE
	}

	private Type type;
	private Color color;
	private Color backgroundColor;

	public void setShapeType(Type shapeType) {
		this.type = shapeType;
	}

	public void setShapeColor(Color color) {
		this.color = color;
	}

	public AnyShape(Type shapeType, Color color) {
		this.color = color;
		this.type = shapeType;
	}

	public AnyShape(Color color) {
		this.color = color;
	}

	public AnyShape() {

	}

	public AnyShape(Color color, Color bcolor) {
		this.color = color;
		this.backgroundColor = bcolor;
	}

	public AnyShape(Type shapeType) {
		this.type = shapeType;
	}

}
