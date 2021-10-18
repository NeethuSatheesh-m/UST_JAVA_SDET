package com.ust.test;

public class ExceptionExample7 extends Exception 
{

	//store account information 
	private static int accno[]= {1001,1002,1003,1004};
	
	private static String name[]= {"nish","subu","abhi","akash"};
	
	private static double bal[]= {1000.00,200.98,4350.00,500.00};
	
	public ExceptionExample7() {
		// TODO Auto-generated constructor stub
	}
	public ExceptionExample7(String str) {
		// TODO Auto-generated constructor stub
		super(str);
	}
	public static void main(String[] args) {
		try {
			System.out.println("Accono "+"\t"+"customer"+"\t"+"Balance");
			for(int i=0;i<5;i++) {
				System.out.println(accno[i]+"\t"+name[i]+"\t"+bal[i]);
				if(bal[i]<1000) {
					ExceptionExample7 ee=new ExceptionExample7("Balance is less than 1000");
					throw ee;
				}
			}
		}//end of try
		catch(ExceptionExample7 e) {
			e.printStackTrace();
		}
	}
}
