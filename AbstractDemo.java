package com.practice.demo;

abstract class Shape{
public abstract void print();
}

class Circle extends Shape{
	public void print() {
		System.out.println("I draw Circle");
	}
}

class Rectangle extends Shape{
	public void print() {
		System.out.println("I draw Rectangle");
	}
}

public class AbstractDemo {
	public static void main(String args[]) {
		
		Shape draw = new Circle();
		draw.print();
		Shape draw1 = new Rectangle();
		draw1.print();
		
		
	}

}
