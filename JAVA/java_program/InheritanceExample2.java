package com.ust.test;
class Teacher1{
	void teach()
	{
		System.out.println("Teaching students");
	}
}
class Students1 extends Teacher1{
	void listen() {
		System.out.println("Listening teacher");
	}
}
class HomeTution extends Students1{
	void explains() {
		System.out.println("Done Homework");
	}
}
public class InheritanceExample2 {
	public static void main(String[] args) {
		HomeTution ht = new HomeTution();
		ht.teach();
		ht.listen();
		ht.explains();
		
		
	}

}
