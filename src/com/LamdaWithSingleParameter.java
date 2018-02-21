package com;

@FunctionalInterface
interface MyFunctionalInterface2 {

	//A method with single parameter
    public int incrementByFive(int a);
}
public class LamdaWithSingleParameter {

   public static void main(String args[]) {
        // lambda expression with single parameter num
	   MyFunctionalInterface2 f = (num) -> num+5;
        System.out.println(f.incrementByFive(22));
    }
}
