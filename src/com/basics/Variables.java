package com.basics;

public class Variables 
{
	static Variables variables = new Variables();
//	A variable is a container which holds the value while the Java program is executed. 
//	A variable is assigned with a data type.
	
//	Types of Variables
	
	/*
		1. Local variable
			# Declared inside a method, constructor, or block.
			# Accessible only within the method or block.
			# Must be initialized before use.
	*/
		public void localVariable() {
		    int age = 25; // Local variable
		    System.out.println("Age: " + age);
		}

	
		
	/*
		2. Instance variable
			# Declared outside methods but inside a class.
			# Belong to an object and have default values.
			# Accessible by all methods of the class.
	 */
		String name; // Instance variable
		int age;     // Instance variable
		
		public void instanceVariable() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }

	/*
		3. Static variable 
			# Declared using the "static" keyword.
			# Belong to the class rather than any object.
			# Shared among all instances of the class.
	*/
		final static String clg = "Zeal";
		int roll_no;
		
		public void staticVariable()
		{
			System.out.println("Roll No: "+ roll_no + "  Name: "+ name + "  clg: "+ clg);
		}

	public static void main(String[] args) 
	{
		variables.localVariable();
		
		variables.instanceVariable();
		
		variables.staticVariable();
	}
}
