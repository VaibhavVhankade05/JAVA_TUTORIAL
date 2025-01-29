package com.multithreading;

public class JavaMultithreading 
{
	/*
		"Multithreading" in Java is a process of executing multiple threads simultaneously to maximize CPU utilization. 
		It enables concurrent execution, allowing programs to perform multiple tasks at the same time. 
		Java provides built-in support for multithreading using the Thread class and Runnable interface.
		Eg. Reso

		# Key Concepts of Multithreading in Java
			1. Thread: A lightweight process that runs independently.
			2. Concurrency: Multiple threads run in parallel.
			3. Synchronization: Managing shared resources between threads.
			4. Inter-thread Communication: Threads communicate with each other.
			5. Thread Life Cycle: Various states of a thread.	

		In Java, multithreading is implemented using two main approaches:
			1. Extending the Thread class
			2. Implementing the Runnable interface
			
		To create a thread using this approach:
			1. Extend the Thread class
			2. Override the run() method
			3. Start the thread using start()
			
		Key Points:
			We extend Thread and override run(), which contains the task to execute.
			Calling start() invokes run() in a new thread.
			Each thread has a unique execution path.
			
			
		2. Runnable Interface Approach
			Instead of extending Thread, we implement the "Runnable" interface.
			
			Create a class that implements Runnable
			Implement the run() method
			Create a Thread object and pass the Runnable object to it
			Call start() to begin execution
			
		Key Points:
			The run() method contains the logic to execute in a thread.
			The Runnable object is passed to a Thread object.
			
		Which One Should You Use?
			Use Thread class when your class doesn't need to "extend" another class.
			Use Runnable interface if you want better "flexibility" and code "reusability".
	*/
}
