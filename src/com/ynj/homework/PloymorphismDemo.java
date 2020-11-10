package com.ynj.homework;

public class PloymorphismDemo {
	public static void main(String []args) {
	displayObject(new Circle(1,"red",false));
	displayObject(new Rectangle(1,1,"blcak",true));
	}
	public static void displayObject(GeometricObject object) {
		System.out.println("Created on "+object.getDateCreated()+" "+object.getColor());
	}
}
