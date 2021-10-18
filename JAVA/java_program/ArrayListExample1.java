package com.ust.test;

import java.util.ArrayList;

public class ArrayListExample1 {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("mazda");
		for(String str:cars)
		{
			System.out.println(str);
		}
	}

}
