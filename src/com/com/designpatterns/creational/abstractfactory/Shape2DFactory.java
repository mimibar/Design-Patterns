package com.designpatterns.creational.abstractfactory;

import com.designpatterns.models.Circle;
import com.designpatterns.models.Shape;
import com.designpatterns.models.Square;

/**
 * The Concrete Factory 2
 * 
 */
public class Shape2DFactory implements ShapeFactory {

	/* (non-Javadoc)
	 * @see com.designpatterns.creational.abstractfactory.ShapeFactory#getRoundShape()
	 */
	public Shape getRoundShape() {
		return new Circle();

	}

	public Shape getSquaredShape() {
		return new Square();

	}
}
