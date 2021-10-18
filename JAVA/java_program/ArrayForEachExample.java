package com.ust.test;

public class ArrayForEachExample {
	public static void main(String[] args) {
		//creating Array
		int[] age= {10,45,18,4,23};
		//Display the Array using for-each
		System.out.print("Using for-each :");
		for(int a : age)
		{
			System.out.println(a);
		}
	}

}
