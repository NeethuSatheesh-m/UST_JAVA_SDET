package com.ust.test;

abstract class Anonymousinner{
	public abstract void mymethod();
}

public class AnonymousInnerExample {
	public static void main(String[] args) {
		Anonymousinner inner = new Anonymousinner() {
			
			@Override
			public void mymethod() {
				// TODO Auto-generated method stub
				System.out.println("This is an example of anonymous inner class");
			}
		};
		inner.mymethod();
	}

}
