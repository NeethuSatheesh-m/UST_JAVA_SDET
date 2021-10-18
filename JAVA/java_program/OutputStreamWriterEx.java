package com.ust.test;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterEx {
	public static void main(String[] args) {
		String data="This is the line of text inside the file";
		try {
			//create a File OutputStream
			FileOutputStream file= new FileOutputStream("output.txt");
			//create a OutputStreamWriter
			OutputStreamWriter output = new OutputStreamWriter(file);
			 
			//Write the string to the file
			output.write(data);
			//close output
			output.close();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

}
}
