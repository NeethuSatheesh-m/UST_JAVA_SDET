package com.ust.test;
class Company{
	String name;
	//public  constructor
	public Company() {
		name ="Abcd";
	}
}

public class PublicConstructorExample {
	
	public static void main(String[] args) {
		//object created in another class
		
		Company obj=new Company();
		System.out.println("name : "+obj.name);
		System.out.println();
	}

}
