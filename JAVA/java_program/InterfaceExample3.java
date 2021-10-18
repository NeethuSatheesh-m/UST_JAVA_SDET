package com.ust.test;
interface A
{
	public void display();
}
interface B
{
	//public void display2();
	default void display2() {
		System.out.println("display2 method");
	}
}
interface C extends A,B{
	public void display3();
}
public class InterfaceExample3 implements C {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display1 method ");
		
	}
	
	/*@Override
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("Display2 method ");
		
	}*/
	@Override
	public void display3() {
		// TODO Auto-generated method stub
		System.out.println("Display3 method ");
		
	}
public static void main(String[] args) {
	InterfaceExample3 i = new InterfaceExample3();
	i.display();
	i.display2();
	i.display3();
		
	}

}
