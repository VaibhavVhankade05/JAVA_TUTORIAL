package com.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throw 
{
	/*
	 	Exceptions allows us to write good quality codes where the errors are checked at the compile time instead of runtime and we can create custom exceptions making the code recovery and debugging easier.
	 	
	 	syntax:
	 		throw new exception_class("error message");  
	 */


	public static void validate(int age) throws ArithmeticException
	{  
		if(age<18) {  
			//throw Arithmetic exception if not eligible to vote  
			throw new ArithmeticException("Person is not eligible to vote");    
		}  
		else {  
			System.out.println("Person is eligible to vote!!");  
		}  
	}  
	
	
	
	//function to check if person is eligible to vote or not   
    public static void method() throws FileNotFoundException 
    {  
  
        FileReader file = new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");  
        BufferedReader fileInput = new BufferedReader(file);  
  
      
        throw new FileNotFoundException();  
      
    }  


	//main method  
	public static void main(String args[])
	{  
		//calling the function  
//		try {
//			validate(15);
//		} 
//		catch (Exception e) 
//		{
//			System.out.println(e);
//			System.out.println("vaibhav");
//		} 
//		System.out.println("rest of the code...");   
		
		try  
        {  
            method();  
        }   
        catch (FileNotFoundException e)   
        {  
//            e.printStackTrace(); 
        	System.out.println(e);
        }  
        System.out.println("rest of the code...");
	} 
}
