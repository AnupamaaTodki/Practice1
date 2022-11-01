package com.practice.demo;

import java.util.ArrayList;

public class SeperateZero {

	public static void checkZero(ArrayList<Character> myArray) {
		ArrayList<Character> newArray = new ArrayList<>();
		for (int i = 0; i < myArray.size(); i++) {
			if (myArray.get(i) != '0' ) {
				newArray.add(myArray.get(i));
				//System.out.println(newArray.get(i));
			}
			
		}
	for(Object i:newArray) {
		System.out.println(i);
	}
		}
	
	public static void main(String args[]) {
		ArrayList<Character> myArray = new ArrayList<>();
		myArray.add('a');
		myArray.add('y');
		myArray.add('h');
		myArray.add('0');
		myArray.add('u');
		myArray.add('0');
        checkZero(myArray);
	}

}
