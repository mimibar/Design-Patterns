package com.designpatterns.models;

/**
 * The Concrete Product
 */
public class Sphere implements Shape {

	@Override
	public void draw() {
		System.out.println("Sphere.draw() method");
	}

}
