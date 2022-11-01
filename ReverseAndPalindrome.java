package com.practice.demo;

public class ReverseAndPalindrome {
	public static void main(String args[]) {
		String name = "madam";
		String revString = "";
		for(int i = name.length()-1; i >= 0; i -- ) {
			revString = revString + name.charAt(i);
		}
		System.out.println("Reverse of the string " + name + " is " + revString);
		
		if(name.equals(revString)) {
			System.out.println("Given string " + name + " is palindrome");
		}
		else {
			System.out.println("Given string " + name + " is not a palindrome");
		}
		
	}

}
