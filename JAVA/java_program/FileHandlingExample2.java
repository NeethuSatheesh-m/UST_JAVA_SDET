package com.ust.test;

import java.io.File;

public class FileHandlingExample2 {
	public static void main(String[] args) {
		File file = new File("newFile.txt");
		
		try {
			boolean value = file.delete();
			if(value) {
				System.out.println("new file is Deleted");
			}else {
				System.out.println("file is not deleted.");
			}
		}catch(Exception e) {
			e.getStackTrace();
		}
	}

}
