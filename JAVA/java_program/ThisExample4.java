package com.ust.test;

class ThisTest1{
	int val_a;
	int val_b;
	//Default constructor
	ThisTest1() {
		val_a=10;
		val_b=20;
	}
	ThisTest1 get()
	{
		return this;
		
	}
	void display()
	{
		System.out.println("val_a = "+val_a+"\nval_b = "+val_b);
	}
	
}

public class ThisExample4 {
	public static void main(String[] args) {
		ThisTest1 obj = new ThisTest1();
		obj.get().display();
	}

}
