package com.ust.test;

public class ExceptionExample4 {
	public static void main(String[] args) {
		try {
			String a= "This is like chipping";//length is 22
			char c= a.charAt(24);
			System.out.println(c);
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("StringIndexOutOfBoundsException  =>  "+e.getMessage());
			
		}
	}

}
