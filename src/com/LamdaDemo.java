package com;

import java.util.ArrayList;
import java.util.List;

//5) Lambda Introduction

//A) Lambdas with forEach loop

//JDK 1.8 introduces a new method forEach() to use with lambda expression.

public class LamdaDemo {
	public static void main(String args[]) {
		/*List<String> alphabets = Arrays.asList("A", "B", "C", "D");

		System.out.println("Printing with earlier JDK 1.5 for loop:");
		for (String str : alphabets) {
			System.out.print(str + "\t");
		}
		System.out.println("\nPrinting with latest forEach loop introduced with JDK 1.8 with lambda usage:");
		alphabets.forEach(str -> {
			System.out.print(str + "\t");
		});*/
		List<String> list=new ArrayList<String>();
		list.add("First1");
		list.add("First2");
		list.add("First3");
		list.forEach(str ->{
			System.out.println(str);
		});
		list.forEach(System.out :: println);
	}
}
