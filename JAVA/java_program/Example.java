package com.ust.test;

public class Example{
	
public static void main(String[] args) {
		
		Example1 ex=new Example1(25,"neethu",198.6f);
		ex.display();
		//ex.age=5; error: age is not visible
		//System.out.print(ex.age); error : age is not visible
		
	}
	
}
class Example1 {
	private int age;
	private String name;
	private float salary;
	Example1(int x,String y,float z){
		age = x;
		name = y;
		salary= z;
	}
	
	void display()
	{
		System.out.println(age+"\n"+name+"\n"+salary);
	}
	
	

}
