package com.ust.test;

class OuterClass1{

}

public class OuterInnerClassEx2 {
	
		//instance method of the outer class
	void my_method() {
		int num=23;
		//method local inner class
		class MethodInnerDemo{
			public void print() {
				System.out.println("This is methode inner class "+num);
			}
		}
		//end  of inner class
		//Accessing the inner class
		MethodInnerDemo inner = new MethodInnerDemo();
		inner.print();
	}
	public static void main(String[] args) {
		OuterInnerClassEx2 outer = new OuterInnerClassEx2();
		outer.my_method();
	}

}
