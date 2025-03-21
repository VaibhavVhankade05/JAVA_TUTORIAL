package com.multithreading;

public class Wait_Notify extends Thread
{
	/*
		Synchronization
			Synchronization in Java is a critical concept in concurrent programming that ensures multiple threads can interact with shared resources safely. 
			In a nutshell, synchronization prevents race conditions, where the outcome of operations depends on the timing of thread execution. 
			It is the capability to control the access of multiple threads to any shared resource. Synchronization is a better option where we want to allow only one thread to access the shared resource.
	*/
		
		class SynchronizedCounter {  
		    private int count = 0;      
		    public synchronized void increment() {  
		        count++;  
		    }      
		    public synchronized int getCount() {  
		        return count;  
		    }  
		}  
	
	public static void main(String[] args) 
	{
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                resource.produce();
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                resource.consume();
            }
        });

        producer.start();
        consumer.start();
    }
}


class SharedResource {
    private boolean available = false;

    public synchronized void produce() {
        try {
            if (available) {
                wait(); // Wait if data is already produced
            }
            System.out.println("Producer: Produced data");
            available = true;
            notify(); // Notify consumer
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void consume() {
        try {
            if (!available) {
                wait(); // Wait if data is not yet produced
            }
            System.out.println("Consumer: Consumed data");
            available = false;
            notify(); // Notify producer
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}