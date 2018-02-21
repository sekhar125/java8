package com;

//4) Introduction of Functional Interfaces

//An interface containing only one abstract method is known as functional interface. 
@FunctionalInterface
interface MyFunctionalInterface {

    public int addMethod(int a, int b);
}



public class Functionalnter {

	   public static void main(String args[]) {
	        // lambda expression
	    	MyFunctionalInterface sum = (a, b) -> {System.out.println("Sum");return (a + b);};
	        System.out.println("Result: "+sum.addMethod(12, 100));
	    }
	}
