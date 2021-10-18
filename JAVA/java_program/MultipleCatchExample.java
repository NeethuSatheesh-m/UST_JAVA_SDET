package com.ust.test;

public class MultipleCatchExample {
	
	public static void main(String[] args) {
		try {
		int a= 5/0;
		int[] arr=new int[5];
		arr[6]=8;
		
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException  => "+e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException  => "+e.getMessage());
		}catch(Exception e) {
			System.out.println("Exception  => "+e.getMessage());
		}
	}

}
