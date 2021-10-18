package com.ust.test;

public class LabeledBreakExample {
	public static void main(String[] args) {
		//the for  loop is labeled as first
		first:
			for(int i=1;i<5;i++) {
				//the for loop is label as second
				second:
					for(int j=1;j<3;j++)
					{
						System.out.println("i = "+i+" j = "+j);
						//if i=2 then break first for loop
						if(i==2)
							break first;
						if(j==2)
							break second;
					}
			}
	}

}
