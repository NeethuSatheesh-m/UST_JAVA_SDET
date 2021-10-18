package com.ust.test;

class Animal1{
	//protected method
	protected void display() {
		System.out.println("Iam an Animal");
		
	}
}

public class AccessModifierExample3 extends Animal1 {
	public static void main(String[] args) {
		Animal1 a = new Animal1();
		//access the protected method
		a.display();
	}

}
