package com.ust.test;
//interface 
interface polygon{
	void getArea(int length , int breadth);
}
//implements the polygon interface
class Rectangle1 implements polygon{

	@Override
	public void getArea(int length, int breadth) {
		// TODO Auto-generated method stub
		System.out.println("The area of rectangle is  "+(length*breadth));
		
	}
	
}

public class InterfaceExample1 {
	public static void main(String[] args) {
		Rectangle1 r =new Rectangle1();
		r.getArea(5, 6);
	}

}
