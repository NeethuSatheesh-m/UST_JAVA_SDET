package com.ust.test;

/*class Mainclass{
	int f;
	int c;
	private Mainclass() {
		f=20;
		c=35;
	}
}*/

public class PrivateConstructorExample {
	int a;
	boolean b;
	//private constructor
	private PrivateConstructorExample() {
		a=7;
		b=true;
	}
	public static void main(String[] args) {
		//call the constructor
		PrivateConstructorExample obj= new PrivateConstructorExample();
		System.out.println("Default Value :");
		System.out.println("a : "+obj.a);
		System.out.println("b : "+obj.b);
		//Mainclass ob=new Mainclass();
	}

}
