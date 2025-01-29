package com.multithreading;

public class MyRunnable implements Runnable
{

	@Override
	public void run() {
		System.out.println("Thread is running..." + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
//		Way 1
		Runnable myRunnable = new MyRunnable();
		myRunnable.run();
		
//		Way 4
		MyRunnable myRunnable2 = new MyRunnable();
		myRunnable.run();
		
//		Way3
		Thread thread2 = new Thread(myRunnable);
		thread2.start();
		
//		Way 2
		Thread thread3 = new Thread(new MyRunnable());
		thread3.start();
	}

}
