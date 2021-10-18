package com.ust.test;

import java.util.Scanner;

public class NumberSumDoWhileEx {
	
	public static void main(String[] args) {
		int sum=0;
		int num=0;
		//create an object for Scanner class
		Scanner input = new Scanner(System.in);
		//do-while loop continue until a entered number is positive
		do {
			sum+=num;
			//take a user input
			System.out.println("Enter a number: ");
			num=input.nextInt();
		
		}while(num>=0);
		System.out.println("Sum : "+sum);
		input.close();
	}

}
