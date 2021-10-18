package com.ust.test;

class Overridden{
	//overridden method
	void disp() {
		System.out.println("disp() of parent class");
	}
}

public class MethodOverridingEx2 extends Overridden {
	//overriding method
	void disp() {
		System.out.println("disp() of child class");
	}
	public static void main(String[] args) {
		//parent class object refers to the parent class method
		Overridden or=new Overridden();
		or.disp();
		//child class object that refers to the child class method
		Overridden mo=new MethodOverridingEx2();
		mo.disp();
	}
	

}
