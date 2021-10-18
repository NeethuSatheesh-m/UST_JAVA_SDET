package com.ust.test;
class Student{
	//instance variable
	int rollNo;
	String name;
	//static variable
	static String collegeName;
}

public class StaticExample4 {
	public static void main(String[] args) {
		//object creation
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		//assign value to static variable
		Student.collegeName="topper";
		
		//assign value to instance variable
		s1.rollNo=1;
		s1.name="abi";
		
		s2.rollNo=2;
		s2.name="anu";
		
		s3.rollNo=3;
		s3.name="ammu";
		
		//print student details
		System.out.println(" Object s1 \n rollNo : "+s1.rollNo+"   Name : "+s1.name+"   College name : "+s1.collegeName);
		System.out.println(" Object s2 \n rollNo : "+s2.rollNo+"   Name : "+s2.name+"   College name : "+s2.collegeName);
		System.out.println(" Object s3 \n rollNo : "+s3.rollNo+"   Name : "+s3.name+"   College name : "+s3.collegeName);
		
		//changing the value of static variable in one object s2
		s2.collegeName="My college"; //if one object change the value of static variable then it  will reflect into all object
		
		//changing the value of instance variable(name) in one object s2
		s2.name="new name";
		
		//Display after changing 
		System.out.println("\n Display after changing \n");
		System.out.println(" Object s1 \n rollNo : "+s1.rollNo+"   Name : "+s1.name+"   College name : "+s1.collegeName);
		System.out.println(" Object s2 \n rollNo : "+s2.rollNo+"   Name : "+s2.name+"   College name : "+s2.collegeName);
		System.out.println(" Object s3 \n rollNo : "+s3.rollNo+"   Name : "+s3.name+"   College name : "+s3.collegeName);
		
	}

}
