package com.practice.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Array {
	
	public static void PrintEle(ArrayList<String> array) {
	for(String i : array) {
		System.out.println(i);
	}
	}
	
	
	public static void PrintElem(ArrayList<String> array) {
//		for(int i=0;i<array.size();i++) {
//			System.out.println(array.get(i));
//		}
		Collections.sort(array);
		System.out.println(array);
	}
	public static void main(String args[]) {
		ArrayList<String> array = new ArrayList<>();
		array.add("anu");
		array.add("arya");
		array.add("anupama");
		array.add("chocolate");
		PrintEle(array);
		PrintElem(array);
		System.out.println(array.get(0));
		System.out.println(array.get(2));
		System.out.println(array.size());
		Collections.sort(array);
//		for(String i: array) {
//			System.out.println(i);
//		}
		System.out.println(array);
		array.set(0, "aaaa");
//		for(String i: array) {
//			System.out.println(i);
//		}
		System.out.println(array);
		array.remove(3);
		for(String i: array) {
			System.out.println(i);
		}
		array.clear();
		System.out.println("annnnnuuu");
		
		for(String i: array) {
				System.out.println(i);
		}
		
	}

}
