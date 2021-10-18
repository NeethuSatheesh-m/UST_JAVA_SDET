package com.ust.test;

public class SwitchCaseExample {

	public static void main(String[] args) {
		int x=5;//local variable
		char c='b';//character defined in java
		String str="neethu";
		//Integer
		switch(x*2) {
		case 5 : 
			System.out.println("In case 5");
			break;
		case 10 :
			System.out.println("In case 10");
			break;
		/*default:
			System.out.println("default");*/
		}
		//character
		switch (c) {
		case 'e':
			System.out.println("case e");
			break;
		default:
			System.out.println("default");
			break;
		case 'a':
			System.out.println("case a");
			break;
		}
		//String
		switch (str) {
		case "ashna":
			System.out.println("Ashna");
			break;
		case "neethu":
			System.out.println("Neethu");
			break;

		default:
			System.out.println("Default name");
			break;
		}
	}
}
