package com.ust.test;
abstract class Base{
	abstract void fun();
	
}
class Derived extends Base{
	void fun() {
		System.out.println("Deried cls fun() called");
	}
}

public class AbstractionExample2 {
	public static void main(String[] args) {
		//Base b=new Base(); error: can't create an instance of abstract class
		//Derived d= new Derived();
		Base b=new Derived();
		b.fun();
	}

}
