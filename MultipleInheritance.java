package com.practice.demo;

interface Demo1{
	default void a() {
		System.out.println("I am demo 1 ");
	}
	}

interface Demo2{
	default void a() {
		System.out.println("I am demo 2");
	}
    }


public class MultipleInheritance implements Demo1,Demo2{
	public void a() {
		Demo1.super.a();
		Demo2.super.a();
		}
	public static void main(String[] args) {
		MultipleInheritance obj = new MultipleInheritance();
		obj.a();
	}

}
