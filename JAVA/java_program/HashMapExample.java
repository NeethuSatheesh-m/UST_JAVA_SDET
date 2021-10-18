package com.ust.test;

import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {
		
		//create a HashMap object called people
		HashMap<String, Integer> people = new HashMap<String, Integer>();
		
		//add key and values (Name ,Age)
		people.put("neethu", 25);
		people.put("anu", 35);
		people.put("anu", 42);
		
		people.put("ram", 15);
		people.put("hari", 15);
		people.put("anoop", 30);
		System.out.println(people);
		for(String i :people.keySet()) {
			System.out.println("key : "+i+"\t value : "+people.get(i));
		}
	}

}
