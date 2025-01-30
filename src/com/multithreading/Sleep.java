package com.multithreading;

public class Sleep extends Thread
{
	public void run() 
	{
        for (int i = 1; i <= 5; i++) 
        {
            try 
            {
                System.out.println("Thread running: " + i );
                Thread.sleep(3000); // Pauses for 1 second
            } 
            catch (Exception e) 
            {
                System.out.println(e);
            }
        }
	}	
	
	public static void main(String[] args) {
		
		Sleep sleep = new Sleep();
		sleep.start();
	}
}
