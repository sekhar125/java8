package com;

@FunctionalInterface
interface IFunctionalInterface{
	void display(String a, String b);
}

class Input{
	public Input(){
		System.out.println("Empty Constructor");
	}
	public Input(String a1, String b1){
		System.out.println("Constructor "+a1+"--"+b1);
	}
	public Input(int a1, String b1){
		System.out.println("Constructor INT "+a1+"--"+b1);
	}
	public static void m1(String a1, String b1){
		System.out.println("m1 "+a1+"--"+b1);
	}
	
	public void m2(String a1, String b1){
		System.out.println("m2 "+a1+"--"+b1);
	}
}

public class FuncInterDemo {

	public static void main(String[] args) {
		
		IFunctionalInterface ref = Input::new;
		ref.display("Hello", "Constructor");
		System.out.println();
		IFunctionalInterface ref1 = Input::m1;
		ref1.display("Hello", "m1");
		
		Input in = new Input();
		IFunctionalInterface ref2 = in::m2;
		ref2.display("Hello", "m2");

	}

}
