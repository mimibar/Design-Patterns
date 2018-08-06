package com.designpatterns.creational.builder;

import java.awt.Color;

/**
 * The Builder
 *
 */
public interface ShapeBuilder {
	ShapeBuilder buildShape();

	ShapeBuilder buildShapeType(AnyShape.Type shapeType);
	
	ShapeBuilder buildColor(Color shapeColor);

	AnyShape build();
}
