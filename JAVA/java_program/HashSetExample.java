package com.ust.test;

import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		//create a HashSet object called numbers
		HashSet<Integer> numbers = new HashSet<Integer>();
		
		//Add value to the numbes set
		numbers.add(4);
		numbers.add(8);
		numbers.add(3);
		numbers.add(14);
		numbers.add(18);
		numbers.add(4);
		numbers.add(8);
		//display set
		System.out.println(" Set  is ");
		for(int str:numbers)
		{
			System.out.print(str+"\t");
		}
		System.out.println();
		
		//Show which numbers between 1 and 10 are in the set
		//System.out.println("numbers between 1 and 10 are in the set  ");
		for(int i=1;i<=10;i++) {
			if(numbers.contains(i)) {
				System.out.println(i+" was found in the set .");
			}
			else {
				System.out.println(i+" not was found in the set .");
			}
		}
		
	}

}
