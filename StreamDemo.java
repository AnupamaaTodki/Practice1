package com.practice.demo;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String args[]) {
	ArrayList<Integer> list = new ArrayList<>();
	list.add(8);
	list.add(32);
	list.add(78);
	list.add(17);
	//Predicate<Integer> isEven = ((n) -> n%2 == 0);
	boolean even = list.stream().anyMatch(n -> n%2 == 0);
	System.out.println(even);
	
	Optional<Integer> first = list.stream().findFirst();
	System.out.println(first);
	
	System.out.println(list.stream().max(Integer::compare).get());
//	System.out.println(max);
	
	Predicate <Integer> test = n -> n<60;
	list.stream().filter(test).forEach(System.out::println);

	list.stream().filter(n -> n > 60).forEach(System.out::println);
	}

}
