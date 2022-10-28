package com.practice.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class CharacterPresentOrNot {

	public static ArrayList<String> charIsPresent(ArrayList<String> arr) {
		ArrayList<String> newList = new ArrayList<>();
		System.out.println("Enter the character to search");
		Scanner sc = new Scanner(System.in);
		String enterdChar = sc.nextLine();
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).contains(enterdChar)) {
				newList.add(arr.get(i));
			}
		}
		return newList;
	}

	public static void printArray(ArrayList<String> arr){
		ArrayList<String> printList = charIsPresent(arr);
		if(printList.size() != 0) {
			System.out.println("Character is present");
			for(String element: printList) {
				System.out.println(element);
			}
			
		}
		else {
			System.out.println("Character is not present");
		}
	}

	public static void main(String args[]) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Bhagya");
		arr.add("Soujanya");
		arr.add("Mukta");
		arr.add("Anandi");
		arr.add("Hasini");

		printArray(arr);
	}

}
