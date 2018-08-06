package com.designpatterns.creational.builder;

import java.awt.Color;

import com.designpatterns.creational.builder.AnyShape;

/**
 * The Concrete Builder
 *
 */
public class Shape2DBuilder implements ShapeBuilder {

	private AnyShape anyShape;

	public ShapeBuilder buildShape() {
		anyShape = new AnyShape(Color.WHITE, Color.BLACK);
		System.out.println("buildShape");
		return this;
	}

	public ShapeBuilder buildShapeType(AnyShape.Type shapeType) {
		anyShape.setShapeType(shapeType);
		System.out.println("buildShapeType");
		return this;
	}

	public ShapeBuilder buildColor(Color shapeColor) {
		anyShape.setShapeColor(shapeColor);
		System.out.println("buildColor");
		return this;
	}

	public AnyShape build() {
		System.out.println("getShape");
		return anyShape;

	}

}
