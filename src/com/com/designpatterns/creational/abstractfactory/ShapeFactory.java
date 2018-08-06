package com.designpatterns.creational.abstractfactory;

import com.designpatterns.models.Shape;

/**
 * The Abstract Factory
 *
 */
public interface ShapeFactory {

	/**
	 * Abstract Product A
	 * 
	 * @param shapeType
	 * @return a Product A
	 */
	public Shape getRoundShape();

	/**
	 * Abstract Product B
	 * 
	 * @param shapeType
	 * @return a Concrete Product B
	 */
	public Shape getSquaredShape();

}
