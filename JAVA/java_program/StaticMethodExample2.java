package com.ust.test;

public class StaticMethodExample2 {
	//static variable
	static int age;
	static String name;
	//static method
	static void display()
	{
		System.out.println("Age : "+age);
		System.out.println("name : "+name);
	}
	public static void main(String[] args) {
		age=10;
		name="neethu";
		//static method call,no need a object to  call static method
		display();
	}

}
