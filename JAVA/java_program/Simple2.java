package com.ust.test;

public class Simple2 {
	static int count =0;//static variable
	int x=5;//Instance Variable

	public static void main(String[] args) {
		byte a=10;
		byte b=10;
		//byte c=a+b is an error : cannot convert from int to byte
		byte c= (byte)(a+b);
		System.out.print(c);
		/* Type Casting
		double d=2.5;
		float f=(float)d; */
	}
}
