package com.ust.test;

import java.io.FileInputStream;

import java.io.InputStreamReader;

public class InputStreamReaderEx {
	public static void main(String[] args) {
		char[] arr =new char[100];
		try {
			//create a reader using file reader
			FileInputStream file= new FileInputStream("input.txt");
			//create a inputStreamReader
			InputStreamReader input = new InputStreamReader(file);
			 
			//Read the characters from file 
			input.read(arr);
			System.out.println("Data in the stream  : ");
			System.out.println(arr);
			//close input
			input.close();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
