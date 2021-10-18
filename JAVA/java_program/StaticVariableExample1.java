package com.ust.test;

public class StaticVariableExample1 {
	//static variable
	static int count=0;
	// non-static method 
	public void increment() {
		count++;
	}
//static method
	public static void main(String[] args) {
		StaticVariableExample1 obj1= new StaticVariableExample1();
		StaticVariableExample1 obj2= new StaticVariableExample1();
		StaticVariableExample1 obj3= new StaticVariableExample1();
		obj1.increment();
		
		obj2.increment();
		System.out.println("obj1: count is ="+obj1.count);
		System.out.println("obj2: count is ="+obj2.count);
		//static variable is  a global  variable
		count=10;
		obj3.increment();
		System.out.println("obj3: count is ="+obj3.count);
		
	}

}
