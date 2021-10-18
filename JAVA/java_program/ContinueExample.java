package com.ust.test;

public class ContinueExample {
	public static void main(String[] args) {
		for(int i=0;i<=10;i++)
		{
			//if the value of i is between 4 and 9 then continue is executed
			if(i>4&&i<9)
			{
				continue;
			}
			System.out.println(i);
		}
	}

}
