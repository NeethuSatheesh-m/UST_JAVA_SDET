package com.ust.test;
class ParentClass{
	//overridden method
	void display()
	{
		System.out.println("Parent class method");
	}
}

public class SuperExample2 extends ParentClass {
	//overridden method
		void display()
		{
			System.out.println("Child class method");
			super.display();
		}
		/*void printMsg()
		{
			display();
			super.display();
		}*/
		public static void main(String[] args) {
			SuperExample2 obj = new SuperExample2();
			ParentClass obj1= new ParentClass();
			//obj1.display();
			obj.display();
			//obj.printMsg();
		}

}
