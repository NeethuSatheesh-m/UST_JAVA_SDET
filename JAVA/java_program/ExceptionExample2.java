package com.ust.test;

public class ExceptionExample2 {
	//int a=2;
	public static void main(String[] args) {
		//int d;
		try {
			//code that generate  exception
		int dividebyZero=2/0;
		}catch(Exception e){
			//e.printStackTrace();
			System.out.println("Arithematic Exception =>  "+e.getMessage());
		}
		finally {
			System.out.println("Final Block executed");
		}
		
	}

}
