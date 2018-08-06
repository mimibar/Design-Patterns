package com.designpatterns.models;

/**
 * The Concrete Product
 */
public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle.draw() method");
	}
}
