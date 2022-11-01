package com.practice.demo;

import java.util.Arrays;
import java.util.Collections;

public class CheckReverse {
	
	public static void reverse(String arrStr[]) {
		Collections.reverse(Arrays.asList(arrStr));
		System.out.println("After reverse" +Arrays.asList(arrStr));
	}
	public static void main(String args[]) {
		String arrStr[] = {"anu","pama","todki","anpur"};
		System.out.println("Before reverse" +Arrays.asList(arrStr));
		reverse(arrStr);
	}
	
	
	
	
	

}
