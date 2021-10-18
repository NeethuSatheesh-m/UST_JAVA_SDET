package com.ust.test;

import java.io.FileReader;

public class FileReaderExample {
	public static void main(String[] args) {
		char[] arr =new char[100];
		try {
			//create a reader using file reader
			FileReader input= new FileReader("input.txt");
			//Read the characters
			input.read(arr);
			System.out.println("Data in the file : ");
			System.out.println(arr);
			//close input
			input.close();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
