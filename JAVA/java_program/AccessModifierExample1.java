package com.ust.test;

public class AccessModifierExample1 {
	//private variable
	private String name;
	
	public static void main(String[] args) {
		AccessModifierExample1 d = new AccessModifierExample1();
		//access a private variable of another class
		d.name="abc";
		System.out.println(d.name);
	}
	

}
