package com.designpatterns.creational.builder;

import java.awt.Color;

public class Shapes {
	public AnyShape createShapes(ShapeBuilder builder) {
		builder.buildShape()
			.buildColor(Color.BLACK)
			.buildShapeType(AnyShape.Type.CIRCLE);
		AnyShape anyShape = builder.build();
		return anyShape;
	}

}
