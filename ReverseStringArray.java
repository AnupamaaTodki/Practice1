package com.practice.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseStringArray {
	public static void main(String[] args){
		String[] inputArray = { "India", "USA", "Germany", "Australia" };
		System.out.println("Array without reverse : " + Arrays.asList(inputArray));
		reverseArray(inputArray);
	}

	public static void reverseArray(String[] arr) {
		List<String> list = Arrays.asList(arr);
		Collections.reverse(list);
		String[] reversedArray = list.toArray(arr);
		System.out.print("Reverse Array : " + Arrays.asList(reversedArray));
	}
}

//public class Main {	 	
//    static void reverse(String myArray[])
//    {
//        Collections.reverse(Arrays.asList(myArray));
//        System.out.println("Reversed Array:" + Arrays.asList(myArray));
//    }
// 
//     public static void main(String[] args)
//    {
//        String [] myArray = {"one", "Two", "Three", "Four", "Five", "Six","Seven"};
//        System.out.println("Original Array:" + Arrays.asList(myArray));
//        reverse(myArray);
//    }
//}