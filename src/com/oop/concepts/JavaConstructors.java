package com.oop.concepts;


public class JavaConstructors 
{
	String name;
	int age;
	String gender;
	
	/*
	 	Constructor is a block of codes similar to the method.
	 	It is called when an instance of the class is created.
	 	Every time an object is created using the new keyword, at least one constructor is called.
	 	
	 	
	 	# Rules for Creating Java Constructor
			There are following rules for defining a constructor:
			
			* Constructor name must be the "same" as its class name.
			* A Constructor must have no explicit return type.
			* A Java constructor cannot be abstract, static, final.


		# Types of Java Constructors
			There are two types of constructors in Java:
			
			1. Default Constructor (no-arg constructor)
			2. Parameterized Constructor
	 */
	

	    // Default Constructor
	    public JavaConstructors() {
	        System.out.println("Default Constructor Called!");
	    }

	    // Parameterized Constructor
	    public JavaConstructors(String name, int age, String gender) {
	        this.name = name;
	        this.age = age;
	        this.gender = gender;
	        System.out.println("Parameterized Constructor Called!");
	    }

	    // Method to display details
	    public void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Gender: " + gender);
	    }

	    public static void main(String[] args) {
	        // Using the Default Constructor
	        JavaConstructors obj1 = new JavaConstructors();
//	        JavaConstructors obj2 = new JavaConstructors();
//	        JavaConstructors obj3 = new JavaConstructors();
//	        obj1.display();
//
//	        System.out.println("------------------");
//
	        // Using the Parameterized Constructor
	        JavaConstructors obj4 = new JavaConstructors("Vaibhav", 22, "Male");
	        obj4.display();

	    }


}
