package com.multithreading;

public class Wait_Notify extends Thread
{
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