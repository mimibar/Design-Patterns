package com.designpatterns.creational.abstractfactory;

public class ShapeFactoryMaker {

	public enum ShapeFactoryType {
		SHAPE2D, SHAPE3D
	}

	/**
	 * The factory method to create Factory concrete objects.
	 */
	public static ShapeFactory makeFactory(ShapeFactoryType type) {
		switch (type) {
		case SHAPE2D:
			return new Shape2DFactory();
		case SHAPE3D:
			return new Shape3DFactory();
		default:
			throw new IllegalArgumentException("Type not supported.");
		}
	}
}
