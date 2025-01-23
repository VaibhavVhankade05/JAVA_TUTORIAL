package com.exceptionhandling;

public class ExceptionHandling 
{


	/*
	 	Exception Handling in Java
			The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that the normal flow of the application can be maintained.

		What is Exception in Java?
			Execution of a program that disrupts the normal flow of instructions.

		Advantage of Exception Handling
			To maintain the normal flow of the application.

				statement 1;  
				statement 2;  
				statement 3;  
				statement 4;  
				statement 5;//exception occurs  
				statement 6;  
				statement 7;  
				statement 8;  
				statement 9;  
				statement 10;  

		Types of Java Exceptions:

			1. Checked Exception (Compile Time)
				Compiler verifies that the code handles these exceptions either by catching them or declaring them in the method.

					1. IOException: An exception is thrown when an "input/output operation fails", such as when reading from or writing to a file.

					2. SQLException: It is thrown when an error occurs while "accessing a database".

					3. ParseException: Indicates a problem while parsing a string into another data type, such as parsing a date.

					4. ClassNotFoundException: It is thrown when an application tries to load a class through its string name using methods like Class.forName(), but the class with the specified name cannot be found in the classpath.


			2. Unchecked Exceptions (Runtime Exceptions)

					1. NullPointerException: It is thrown when trying to access or call a method on an object reference that is null.

					2. ArrayIndexOutOfBoundsException: It occurs when we try to access an array element with an invalid index.

					3. ArithmeticException: It is thrown when an arithmetic operation fails, such as division by zero.

					4. IllegalArgumentException: It indicates that a method has been passed an illegal or inappropriate argument.

			The try-catch Block
			One of the primary mechanisms for handling exceptions

			syntax:
				try {  
				// Code that may throw an exception  
				} catch (Exception e) {  
				    // Exception handling code  
				} finally {  
				    // Cleanup code  
				} 	

	 */


	public ExceptionHandling() {
		super();
		// TODO Auto-generated constructor stub
	}

	static void Exception()
	{
		System.out.println();
	}



	public void division()
	{
		try {

			int a = 5;
			int b = 0;
			int c = a/b;

			System.out.println(c);

		} catch (Exception e)
		{
			System.out.println(e);
		}

	}



	/*
		 Java finally block

			Java finally block is a block used to "execute important code such as closing the connection".

			Always executed whether an exception is handled or not. 

			Contains all the necessary statements that need to be printed regardless of the exception occurs or not.

			The finally block follows the try-catch block.
	 */


	public void finalBloack()
	{
		try{    
			//below code do not throw any exception  
			int data=25/0;    
			System.out.println(data);    
		}    
		//catch won't be executed  
		catch(Exception e){  
			System.out.println(e);  
		}    
		//executed regardless of exception occurred or not  
		finally {  
			System.out.println("finally block is always executed");  
		}
	}

	
	public static void main(String[] args) {
		ExceptionHandling exceptionHandling = new ExceptionHandling();
		exceptionHandling.finalBloack();

	}


}	
