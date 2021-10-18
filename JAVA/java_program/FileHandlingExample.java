package com.ust.test;

import java.io.File;

public class FileHandlingExample {
	public static void main(String[] args) {
		File file = new File("newFile.txt");
		
		try {
			boolean value = file.createNewFile();
			if(value) {
				System.out.println("new file is created");
			}else {
				System.out.println("file already exists.");
			}
		}catch(Exception e) {
			e.getStackTrace();
		}
	}

}
