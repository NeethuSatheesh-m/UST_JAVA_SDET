package com.ust.test;

 class ThreadExample implements Runnable {
	String name;
	Thread thread;
	ThreadExample(String name){
		this.name=name;
		thread = new Thread(this,name);
		System.out.println("A New thread :" +thread +"is created\n");
		thread.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int j=5;j>0;j--) {
				System.out.println(name +" : "+j);
				Thread.sleep(1000);
				
			}
		}catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(name +" thread interrupted");
		}
		System.out.println(name+" thread exiting ");
		
	}
	

}
 public class ThreadExample2{
	 public static void main(String[] args) {
		new ThreadExample("1st");
		new ThreadExample("2nd");
		new ThreadExample("3rd");
		try {
			Thread.sleep(8000);
			
		}catch(InterruptedException e) {
			System.out.println("Interruption occurs i Main Thread");
		}
		System.out.println("We are exiting from Main thread");
	}
	 
 }
