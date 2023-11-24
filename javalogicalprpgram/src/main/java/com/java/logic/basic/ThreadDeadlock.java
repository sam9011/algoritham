package com.java.logic.basic;

class Thread1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("thread 1 started ");
			Thread.class.wait();
			this.prrintMsg();
			
		}catch(IllegalStateException exception) {
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public synchronized void prrintMsg() {
		System.out.println("thread 1");
	}
	
}
class Thread2 implements Runnable{

	@Override
	public void run() {
		System.out.println("started thread 2");
		new Thread1().prrintMsg();
		System.out.println("called thread 1");
		
	}
	
	
	
}

public class ThreadDeadlock {
	public static void main(String[] args) {
		Thread1 th1 = new Thread1();
		Thread2 th2 = new Thread2();
		Thread th = new Thread(th1);
		Thread th_ = new Thread(th2);
		
		th.start();
		th.start();
		
	}

}
