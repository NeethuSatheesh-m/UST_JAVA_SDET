package com.ust.test;

public class ExceptionExample5 {
	public static void main(String[] args) {
		try {
			//"aka" is not anumber
			int num =Integer.parseInt("aka");
			System.out.println(num);
		}catch(NumberFormatException e) {
			System.out.println("NumberFormatException => "+e.getMessage());
		}
	}

}
