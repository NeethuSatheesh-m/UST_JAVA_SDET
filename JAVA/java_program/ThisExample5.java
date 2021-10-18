package com.ust.test;

class ThisConstruct{
	int val1;
	int val2;
	//Default constructor
	ThisConstruct()
	{
		this(10,20);
		System.out.println("Default Constructor");
	}
	//parameterized constructor
	ThisConstruct(int val1,int val2){
		this.val1=val1;
		this.val2=val2;
		System.out.println("Parameterized Constructor");
	}
}

public class ThisExample5 {
	
	public static void main(String[] args) {
		ThisConstruct obj = new ThisConstruct();
	}

}
