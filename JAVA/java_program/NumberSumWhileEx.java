package com.ust.test;

import java.util.Scanner;

//java program to find the sum of positive integer
public class NumberSumWhileEx {
	public static void main(String[] args) {
		int sum=0;
		//create an object for Scanner class
		Scanner input = new Scanner(System.in);
		//take a user input
		System.out.println("Enter a number: ");
		int num=input.nextInt();
		//while loop continue until a entered number is positive
		while(num>=0)
		{
			sum+=num;
			System.out.println("Enter a number: ");
			num=input.nextInt();
			
		}
		System.out.println("Sum : "+sum);
		input.close();
		
	}

}
