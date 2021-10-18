package com.ust.test;
class Human{
	//overridden method
	void eat() {
		System.out.println("Human is eating");
	}
}
class Boy extends Human{
	//overriding method
	void eat() {
		System.out.println("Boy is eating");
	}
	
}

public class MethodOverriddingEx1 {
	public static void main(String[] args) {
		Boy b=new Boy();
		//this will call the child class method eat
		b.eat();
	}
	

}
