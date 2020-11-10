package com.ynj.homework;

public class CastingDemo {
public static void main(String []args) {
	Object object1=new Circle(1);
	Object object2=new Rectangle(1,1);
	
	displayObject(object1);
	displayObject(object2);
}

private static void displayObject(Object object) {
	if(object instanceof Circle) {
		System.out.println(((Circle)object).getArea());
		System.out.println(((Circle)object).getPerimeter());
	}
	else if(object instanceof Rectangle) {
		System.out.println(((Rectangle)object).getArea());
	}
	
}

}
