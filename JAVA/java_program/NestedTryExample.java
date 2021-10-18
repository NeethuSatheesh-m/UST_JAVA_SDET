package com.ust.test;

public class NestedTryExample {
	public static void main(String[] args) {
		try {
			//inner try block
			try {
				System.out.println("insdied inner try block1");
				int a=23/0;
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			
			//inner try block
			try {
				int[] arr=new int[5];
				arr[7]=23;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("insdied inner try block2");
				System.out.println(e.getMessage());
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
	//outer try block
	
}
