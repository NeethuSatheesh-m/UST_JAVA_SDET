package com.ust.test;

abstract class Base1{
	final void fun()
	{
		System.out.println("Derived class of fun() called");
	}
}
class Derived1 extends Base1{
	
}
public class AbstractionExample3 {
	public static void main(String[] args) {
		//Base b= new Base();
		Base1 b= new Derived1();
		b.fun();
	}

}
