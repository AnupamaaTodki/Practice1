package com.practice.demo;

public class OccuranceOfCharacter {
	public static void main(String args[]) {
		String inputString = "aryavardhan";
		char check = 'a';
		int count = 0;
		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) == check) {
				count ++;
				}
		}
		System.out.println("The character " + check + " is present " + count + " times in the string " + inputString);
		
		}
	}
