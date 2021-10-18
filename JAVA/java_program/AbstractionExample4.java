package com.ust.test;

abstract class Employee{
	private String name;
	private int paymentPerHour;
	public Employee(String name,int paymentPerHour) {
		this.name=name;
		this.paymentPerHour=paymentPerHour;
	}
	public abstract int calculateSalary();
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getpaymentPerHour() {
		return paymentPerHour;
		
	}
	public void setpaymentPerHour(int paymentPerHour) {
		this.paymentPerHour=paymentPerHour;
	}
	
}
public class AbstractionExample4 extends Employee {
	int hour;
	//int paymentPerHour;
	public AbstractionExample4(String name, int paymentPerHour,int hour) {
		super(name, paymentPerHour);
		// TODO Auto-generated constructor stub
		this.hour=hour;
		//this.paymentPerHour=paymentPerHour;
	}

	@Override
	public int calculateSalary() {
		// TODO Auto-generated method stub
		return ((super.getpaymentPerHour())*hour);
	}
	public static void main(String[] args) {
		AbstractionExample4 obj=new AbstractionExample4("neethu",250,12);
		System.out.println("Name :"+obj.getName());
		System.out.println("PaymentPerHour :"+obj.getpaymentPerHour());
		System.out.println("Calculated salary :"+obj.calculateSalary());
	}

}
