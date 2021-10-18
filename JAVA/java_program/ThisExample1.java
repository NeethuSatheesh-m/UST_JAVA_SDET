package com.ust.test;

class ThisTest{
	int val1;
	int val2;
	//parameterized constructor
	ThisTest(int val1,int val2) {
		//if val1 = val1+val2; then value of val1 will be 0
		//if this.val1 = this.val1+val2; then value of val1 will be 10
		//If this.val1 = val1+this.val2; then value of val1 will be 5
		this.val1 = val1+val2;
		this.val2 = val1+val2;
		
	}
	void display()
	{
		System.out.println("value of val1 : "+val1+"\nValue of val2 : "+val2);
	}
}
public class ThisExample1 {
	public static void main(String[] args) {
		ThisTest obj=new ThisTest(5, 10);
		obj.display();
	}

}
