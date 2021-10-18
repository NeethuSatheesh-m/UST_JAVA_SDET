package com.ust.test;

public class PublicMainClassExample {
	public static void main(String[] args) {
		//accessing another public class
		PublicSubClassExample pu = new PublicSubClassExample();
		//accessing public variable of class PublicSubClassExample
		pu.count=25;
		//accessing public method of class PublicSubClassExample
		pu.display();
		
	}

}
