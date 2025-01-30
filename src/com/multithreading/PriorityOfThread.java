package com.multithreading;

public class PriorityOfThread extends Thread
{
	/*
		Each thread has a priority. 
		Priorities are represented by a number between 1 and 10. 
		In most cases, the thread scheduler schedules the threads according to their priority (known as preemptive scheduling). 
		But it is not guaranteed because it depends on JVM specification that which scheduling it chooses. 
		Note that not only JVM a Java programmer can also assign the priorities of a thread explicitly in a Java program.


		3 constants defined in Thread class:
			public static int MIN_PRIORITY
			public static int NORM_PRIORITY
			public static int MAX_PRIORITY

	 */

	// Overriding the run method of the Thread class
	public void run()  
	{  
		try {
			System.out.println("Inside the run() method");  
		} catch (Exception e) {
			System.out.println(e);
		}
	}


	public static void main(String[] args) {

		// Creating three thread objects
		PriorityOfThread th1 = new PriorityOfThread();
		PriorityOfThread th2 = new PriorityOfThread();
		PriorityOfThread th3 = new PriorityOfThread();

		// Printing the default priority of each thread (default is 5)
		System.out.println("Priority Of Thread 1: " + th1.getPriority());
		System.out.println("Priority Of Thread 2: " + th2.getPriority());
		System.out.println("Priority Of Thread 3: " + th3.getPriority());

		// Setting priority using predefined constants (commented)
		 th1.setPriority(MAX_PRIORITY); //10
		 th2.setPriority(NORM_PRIORITY);// 5
		 th3.setPriority(MIN_PRIORITY); // 1

		// Printing the priority after setting them (commented)
		 System.out.println("Priority Of Thread 1: " + th1.getPriority());
		 System.out.println("Priority Of Thread 2: " + th2.getPriority());
		 System.out.println("Priority Of Thread 3: " + th3.getPriority());
		
		// Setting priority explicitly using numeric values
		th1.setPriority(9); // Maximum priority
		th2.setPriority(6);  // Normal priority
		th3.setPriority(4);  // Minimum priority
//		
//		// Printing the updated priority values
		System.out.println("Priority Of Thread 1: " + th1.getPriority());
		System.out.println("Priority Of Thread 2: " + th2.getPriority());
		System.out.println("Priority Of Thread 3: " + th3.getPriority());
		
		th1.start();
	}
}
