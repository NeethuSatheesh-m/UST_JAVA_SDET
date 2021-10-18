package com.ust.test;

public class ConstructorOverLoading {
	String lang;
	ConstructorOverLoading() {
		this.lang="Java";
	}
	ConstructorOverLoading(String lang) {
		//lang=lang; :display null confused with same name
		this.lang=lang;
	}
	public void getname() {
		
		System.out.println("Language : "+this.lang);
		
	}

	public static void main(String[] args) {
		ConstructorOverLoading obj1=new ConstructorOverLoading();
		ConstructorOverLoading obj2=new ConstructorOverLoading("Python");
		
		obj1.getname();
		obj2.getname();
		
		
		
		
	}
}
