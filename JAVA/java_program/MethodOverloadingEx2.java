package com.ust.test;

public class MethodOverloadingEx2 {

	double sum(int x,double y) {
		return (x+y);
	}
	double sum(double x,int y)
	{
		return (x+y);
	}
	public static void main(String[] args) {
		MethodOverloadingEx2 obj=new MethodOverloadingEx2();
		System.out.println("sum method 1:"+obj.sum(7, 3.65f));
		System.out.println("sum method 2:"+obj.sum(7.45f, 3));
	}
}
