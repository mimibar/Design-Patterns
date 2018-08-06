package com.designpatterns.models;

/**
 * The Concrete Product
 */
public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square.draw() method");
	}
}