package com.ust.test;

public class NestedClassEx {
	static class NestedDemo{
		public void my_method() {
			System.out.println("This is my nested class ");
		}
	}
	public static void main(String[] args) {
		NestedClassEx.NestedDemo nested = new NestedClassEx.NestedDemo();
		nested.my_method();
	}

}
