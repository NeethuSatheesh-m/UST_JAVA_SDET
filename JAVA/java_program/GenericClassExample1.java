package com.ust.test;

public class GenericClassExample1 {
	
	public static void main(String[] args) {
		
		//initialize generic class with integer data
		GenericsClass<Integer> intObj = new GenericsClass<>(5);
		System.out.println("Gneric class returns : "+intObj.getData());
		
		//initialize generic class with integer data
		GenericsClass<String> stringObj = new GenericsClass<>("Java Programming");
		System.out.println("Gneric class returns : "+stringObj.getData());
	}

}
//create a generic class
class GenericsClass<T>{
	private T data;
	public GenericsClass(T data) {
		this.data=data;
	}
	public T getData() {
		return this.data;
	}
}