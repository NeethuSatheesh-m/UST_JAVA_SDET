package com.ust.test;

public class GenericClassExample2 {
	public static void main(String[] args) {
		DemoClass demo =new DemoClass();
		
		//generics method working with string
		demo.<String>genericsMethod("java Programming ");
		
		////generics method working with Integer
		demo.<Integer>genericsMethod(10);

	}
	
}
class DemoClass{
	//create a generic method
	public <T> void genericsMethod(T data) {
		System.out.println("Generic Method ");
		System.out.println("Data Passed : "+data);
	}
}