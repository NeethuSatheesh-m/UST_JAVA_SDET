package com.ust.test;

public class DecrmtOptExmple {
	public static void main(String[] args) {
		 int i=5,j=5,sum=0;
		 System.out.println("value of  i = "+i+" j ="+j+" sum = "+sum);
		 //post decrement operator
		 sum=i+j--;
		 System.out.println("value of  i = "+i+" j ="+j+" sum = "+sum);
		 //pre-decrement operator
		 sum=i+--j;
		 System.out.println("value of  i = "+i+" j ="+j+" sum = "+sum);
	}

}
