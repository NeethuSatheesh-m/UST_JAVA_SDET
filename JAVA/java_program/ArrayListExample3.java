package com.ust.test;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListExample3 {
	
	public static void main(String[] args) {
		ArrayList<Integer> myIntegers=new  ArrayList<Integer>();
		myIntegers.add(10);
		myIntegers.add(2);
		myIntegers.add(4);
		myIntegers.add(70);
		myIntegers.add(9);
		
		System.out.println(myIntegers);
		
		/*for(int str:myIntegers)
		{
			System.out.println(str);
		}*/
		Iterator<Integer> it = myIntegers.iterator();
		while(it.hasNext()) {
			Integer i=it.next();
			if(i<10) {
				it.remove();
			}
		
		}
		System.out.println(myIntegers);
		
	}

}
