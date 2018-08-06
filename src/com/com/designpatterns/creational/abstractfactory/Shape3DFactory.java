package com.designpatterns.creational.abstractfactory;

import com.designpatterns.models.Cube;
import com.designpatterns.models.Shape;
import com.designpatterns.models.Sphere;

/**
 * The Concrete Factory 2
 * 
 */
public class Shape3DFactory implements ShapeFactory {

	@Override
	public Shape getRoundShape() {
		return new Sphere();

	}

	public Shape getSquaredShape() {
		return new Cube();

	}
}
