package com.ust.test;
class ThisMethod1{
	void print()
	{
		//calling function show()
		this.show();
		System.out.println("TestMethod::print");
	}
	void show()
	{
		System.out.println("TestMethod::show");
	}
}

public class ThisExample3 {
	public static void main(String[] args) {
		ThisMethod1 obj = new ThisMethod1();
		obj.print();
		
	}

}
