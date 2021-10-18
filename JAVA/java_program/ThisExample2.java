package com.ust.test;

class ThisMethod {
	int val1;
	int val2;
	//parameterized constructor
	ThisMethod() {
		val1 = 10;
		val2 = 20;
		
	}
	void printValue(ThisMethod obj)
	{
		System.out.println("value of val1 : "+obj.val1+"\nValue of val2 : "+obj.val2);
	}
	void get()
	{
		printValue(this);
	}
}
public class ThisExample2 {
	public static void main(String[] args) {
		ThisMethod object = new ThisMethod();
		object.get();
	}

}
