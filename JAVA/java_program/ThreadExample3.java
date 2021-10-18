package com.ust.test;

public class ThreadExample3 extends Thread {
	public void run()
	{
		int a=10;
		int b=12;
		int result=a+b;
		System.out.println("Thread started running ..");
		System.out.println("Sum of two number is : "+result);
	}
	public static void main(String[] args) {
		ThreadExample3 t1=new ThreadExample3();
		t1.start();
	}

}
