package com.ust.test;
class Teacher{
	void teach()
	{
		System.out.println("Teaching students");
	}
}
class Students extends Teacher{
	void listen() {
		System.out.println("Listening teacher");
	}
}

public class InheritanceExample1 {
	public static void main(String[] args) {
		Students obj =new Students();
		obj.teach();
		obj.listen();
	}

}
