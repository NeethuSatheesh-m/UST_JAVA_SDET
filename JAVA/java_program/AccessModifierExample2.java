package com.ust.test;

class Data{
	//private variable
	private String name;
	
	//public method
	public String getName() {
		return this.name;
	}
	//public method
	public void putName(String name)
	{
		this.name=name;
		
	}
	
}
public class AccessModifierExample2 {
	public static void main(String[] args) {
		Data d= new Data();
		//accessing private variable of another class through methods
		d.putName("neethu");
		System.out.println("Name is "+d.getName());
	}

}
