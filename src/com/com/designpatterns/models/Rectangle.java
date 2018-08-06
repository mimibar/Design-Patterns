package com.designpatterns.models;

/**
 * The Concrete Product
 */
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle.draw() method");
	}
}