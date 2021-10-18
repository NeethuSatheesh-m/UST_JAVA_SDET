package com.ust.test;
class AddNumber{
	void  add(int a,int b) {
		System.out.println("Sum of a & b : "+(a+b));
	}
	void  add(float a,float b) {
		System.out.println("Sum of a & b : "+(a+b));
	}
	void add(int a,int b,int c)
	{
		System.out.println("Sum of a,b & c : "+(a+b+c));
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
		AddNumber obj= new AddNumber();
		obj.add(25, 30);
		obj.add(3.5f, 4.2f);
		obj.add(20, 30,10);
	}
	

}
