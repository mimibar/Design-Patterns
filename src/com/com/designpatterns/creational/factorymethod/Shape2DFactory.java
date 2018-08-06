package com.designpatterns.creational.factorymethod;

import com.designpatterns.models.Circle;
import com.designpatterns.models.Rectangle;
import com.designpatterns.models.Shape;
import com.designpatterns.models.Square;

/**
 * The Concrete Creator
 */
public class Shape2DFactory implements ShapeFactory {

	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}

		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();

		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();

		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}

		return null;
	}
}
