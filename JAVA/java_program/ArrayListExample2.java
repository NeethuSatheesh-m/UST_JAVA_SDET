package com.ust.test;

import java.util.ArrayList;

public class ArrayListExample2 {
	public static void main(String[] args) {
		ArrayList<Integer> myIntegers=new  ArrayList<Integer>();
		myIntegers.add(10);
		myIntegers.add(20);
		myIntegers.add(40);
		myIntegers.add(70);
		myIntegers.add(100);
		
		for(int str:myIntegers)
		{
			System.out.println(str);
		}
		
	}

}
