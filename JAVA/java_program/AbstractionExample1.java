package com.ust.test;

abstract class Shape{
	 
	String color;
	abstract double area();
	
	public abstract String toString();
	
	public Shape(String color) {
		System.out.println("Shape constructor called");
		this.color=color;
		
	}
	//this is a concrete method
	public String getColor()
	{
		return color;
	}
}
class Circle extends Shape{
	double radius;
	
	public Circle(String color,double radius) {
		super(color);
		System.out.println("Circle constructor called");
		this.radius=radius;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radius,2);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle color is "+super.color+" and area is  "+area();
	}
	
}

class rectangle extends Shape{
	double length;
	double width;

	public rectangle(String color,double length,double width) {
		super(color);
		System.out.println("REctangle constructor is called ");
		this.length=length;
		this.width=width;
		// TODO Auto-generated constructor stub
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return length*width;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rectangle color is "+super.color+" and area is  "+area();
	}
	
}
public class AbstractionExample1 {
	public static void main(String[] args) {
		
		Shape s1 =new Circle("Red", 2.2);
		Shape s2=new rectangle("Blue", 2, 4);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
	

}
