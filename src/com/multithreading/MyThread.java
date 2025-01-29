package com.multithreading;

public class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Running or Executing Task " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		MyThread thread1 = new MyThread();
		
		thread1.start();
		
		thread1.run();
	}
}
