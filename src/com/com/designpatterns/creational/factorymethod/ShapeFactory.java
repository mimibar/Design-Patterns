package com.designpatterns.creational.factorymethod;

import com.designpatterns.models.Shape;

/**
 * The Creator
 */
public interface ShapeFactory {

	/**
	 * The Factory Method 
	 * 
	 * @param shapeType
	 * @return a Concrete Shape
	 */
	public Shape getShape(String shapeType);
}
