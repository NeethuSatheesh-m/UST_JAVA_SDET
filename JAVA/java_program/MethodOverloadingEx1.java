package com.ust.test;

public class MethodOverloadingEx1 {
	
	int sum(int x,int y) {
		return (x+y);
	}
	int sum(int x,int y, int z)
	{
		return (x+y+z);
	}
	public static void main(String[] args) {
		MethodOverloadingEx1 obj=new MethodOverloadingEx1();
		System.out.println("sum method 1:"+obj.sum(7, 3));
		System.out.println("sum method 2:"+obj.sum(7, 3,5));
	}

}
