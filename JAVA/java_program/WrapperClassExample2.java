package com.ust.test;

public class WrapperClassExample2 {
	
	public static void main(String[] args) {
		//create a object of wrapper class
		Integer aObj= Integer.valueOf(23);
		Double bObj=Double.valueOf(32.87);
		
		//coverting into primitive type
		
		int a=aObj.intValue();
		double b=bObj.doubleValue();
		
		System.out.println("The value of a  : "+a);
		System.out.println("The value of a  : "+b);
	}

}
