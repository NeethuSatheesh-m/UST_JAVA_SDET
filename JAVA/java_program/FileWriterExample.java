package com.ust.test;

import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String[] args) {
		String data ="This data in the Output file";
		try {
			//create a writer using FileWriter
			FileWriter output= new FileWriter("output.txt");
			//Writes string to the file 
			output.write(data);
			System.out.println("Data is written to the file.");
			//close the writer
			output.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
