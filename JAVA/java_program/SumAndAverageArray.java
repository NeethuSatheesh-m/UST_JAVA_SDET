package com.ust.test;

public class SumAndAverageArray {
	public static void main(String[] args) {
		
		int[] num= {10,40,23,4,-2,30,-8,2,-20};
		int sum=0;
		double avg;
		//calculating sum
		for(int n:num)
		{
			sum+=n;
		}
		//calculating length of array
		int arraylen=num.length;
		// convert integer sum and arrylen to double and average calculation
		avg=((double)sum/(double)arraylen);
		System.out.println("Sum : "+sum);
		System.out.println("Average : "+avg);
	}

}
