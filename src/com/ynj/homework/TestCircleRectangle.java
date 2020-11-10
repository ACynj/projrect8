package com.ynj.homework;

public class TestCircleRectangle {

	public static void main(String[] args) {
		Circle circle=new Circle();
		System.out.println("A circle"+ circle.toString());
		System.out.println("the color is "+circle.getColor());
		System.out.println("the radius is "+circle.getRadius());
		System.out.println("the area is "+circle.getArea());
		System.out.println("the diamater is "+circle.getDiameter());
		Rectangle rectangle=new Rectangle(2,4);
		System.out.println(rectangle.toString());
		System.out.println(rectangle.getArea());
		System.out.println(rectangle.getPermeter());
	}
	
}
