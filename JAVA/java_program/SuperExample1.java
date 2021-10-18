package com.ust.test;

class Animal{
	//no argument constructor of class animal
	Animal()
	{
		System.out.println("I am an Animal");
	}
}
class Dog extends Animal{
	//no argument constructor of class Dog
	Dog(){
		//calling the default constructor of super class
		super();
		System.out.println("I am a Dog");
	}
	
}

public class SuperExample1 {
	public static void main(String[] args) {
		 Dog dog1= new Dog();
		
	}

}
