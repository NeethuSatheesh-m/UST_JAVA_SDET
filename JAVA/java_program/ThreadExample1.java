package com.ust.test;

public class ThreadExample1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
	}
	public static void main(String[] args) {
		Thread th1 =new Thread();
		th1.start();
		try {
			th1.sleep(1000);
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		th1.setPriority(1);
		int thpriority = th1.getPriority();
		System.out.println(thpriority);
		System.out.println("THread Running");
	}
	

}
