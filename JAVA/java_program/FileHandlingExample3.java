package com.ust.test;

import java.io.File;

public class FileHandlingExample3 {
	
	public static void main(String[] args) {
		File file = new File("javaExample1\\directory");
		
		try {
			boolean value = file.mkdirs();
			if(value) {
				System.out.println("new Directory created");
			}else {
				System.out.println("Directory already exists.");
			}
		}catch(Exception e) {
			e.getStackTrace();
		}
	}

}
