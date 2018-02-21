package com;

public class OverloadingStastic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b=new Base();
b.display();
	}

}

class Base
{
	 public  void display()
	{
		System.out.print("Base");
	}
}

class Sub extends Base
{
	public  void display()
	{
		System.out.print("Sub");
	}
}