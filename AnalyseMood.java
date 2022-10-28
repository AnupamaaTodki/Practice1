package com.practice.demo;

public class AnalyseMood {
	
	public static void checkMood(String msg) throws Exception
	{
		if(msg.contains("sad")){
			System.out.println("sad mood");
			}
		else if(msg.contains("happy")){
			System.out.println("happy mood");
		}
		else {
			throw new Exception("Enter valid mood");
		}
	}
	
	public static void main(String args[]) throws Exception {
		checkMood("sahjdhdjhjdh");
	}
}
