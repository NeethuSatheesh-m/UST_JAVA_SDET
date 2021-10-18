package com.ust.test;

interface In1
{
	final int a=10;
	//public void display(){} error: abstract method doesnot have any body
	//private void display(){} error: illigel modifier for the interface method display; 
	//only public, abstract, default, static and strictfp are permitted
	default void display()
	{
		System.out.println("Hello");
	}
}


public class InterfaceExample2 implements In1 {
	public static void main(String[] args) {
		InterfaceExample2 i=new InterfaceExample2();
		i.display();
	}

}
