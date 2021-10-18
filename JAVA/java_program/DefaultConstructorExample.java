package com.ust.test;

public class DefaultConstructorExample {
	int a;
	boolean b;
	public static void main(String[] args) {
		//Default constructor is called
		DefaultConstructorExample obj=new DefaultConstructorExample();
		System.out.println("Default Value :");
		System.out.println("a : "+obj.a);
		System.out.println("b : "+obj.b);
	}

}
