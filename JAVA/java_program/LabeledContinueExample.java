package com.ust.test;

public class LabeledContinueExample {
	public static void main(String[] args) {
		//outer for  loop labeled as first
		first:
		for(int i=1;i<6;i++)
		{
			for(int j=1;j<5;j++)
			{
				// if condition is true then skip the current iteration of outer for loop
				if(i==3||j==2)
				{
					continue first;
				}
				System.out.println("i = "+i+" j = "+j);
			}
		}
	}

}
