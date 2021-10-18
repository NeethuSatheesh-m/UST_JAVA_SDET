package com.ust.test;

class OuterDemo{
	int num;
	private class InnerDemo {
		public void print(){
			System.out.println("This is  an inner class");
		}
		
	}
	void displayinner() {
		InnerDemo inner = new InnerDemo();
		inner.print();
	}
}
public class OuterInnerClassEx {
	public static void main(String[] args) {
		OuterDemo outer = new OuterDemo();
		outer.displayinner();
	}

}
