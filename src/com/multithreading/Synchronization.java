package com.multithreading;

import java.util.Iterator;

class SynchronizedCounter {
    private int count = 0;

    // Synchronized method to increment count
    public synchronized void increment() {
        count++;
    }

    // Synchronized method to get count
    public synchronized int getCount() {
        return count;
    }
}

public class Synchronization {
    public static void main(String[] args) 
    {
    	
        SynchronizedCounter counter = new SynchronizedCounter(); // Shared counter

        // Creating multiple threads that increment the counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                counter.increment();
            }
        });

        // Start the threads
        t1.start();
        t2.start();

        // Wait for threads to complete execution
        try {
            t1.join();
            t2.join();
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }

        // Display final count
        for(int i=1;i<=20;i++)
        {
        	System.out.println("Final Count: " + counter.getCount() + "   count"  + i);
        }
    }
}

