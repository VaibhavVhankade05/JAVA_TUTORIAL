package com.oop.concepts;

public class Employee 
{
	/*
		Acquires all the properties and behaviors of a parent object. 
		It is an important part of OOPs.

		Inheritance in Java:
			Inheritance is an Object-Oriented Programming (OOP) concept where one class acquires the properties (fields) and methods of another class. 
			It is a key feature of Java that supports "reusability" and establishes a parent-child relationship between classes.

			Theory of Inheritance:-
				1. Parent Class (Super Class):
					The class whose properties and methods are inherited by another class.
					Example: Person class in the earlier example.

				2. Child Class (Sub Class):
					The class that inherits the properties and methods of the parent class.
					Example: Student class in the earlier example.

				3. extends Keyword:
					Used to establish inheritance in Java.
					Example: class Student extends Person.

				4. Benefits of Inheritance:
					# Code Reusability: Write once, use it multiple times.
					# Method Overriding: Allows a child class to provide a specific implementation of a method already defined in the parent class.
					# Polymorphism: Achieved through method overriding and dynamic method dispatch.

			@ Types of Inheritance in Java
				1. Single Inheritance
					A child class inherits from one parent class.
				Example:
					class Parent { }
					class Child extends Parent { }


				2. Multilevel Inheritance
					A class inherits from a child class, making a chain of inheritance.
					Example
						class GrandParent { }
						class Parent extends GrandParent { }
						class Child extends Parent { }

				3. Hierarchical Inheritance
					Multiple child classes inherit from the same parent class.
					Example:
						class Parent { }
						class Child1 extends Parent { }
						class Child2 extends Parent { } 

	 */

	String name;
	int age;
	String email;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int age, String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public static void main(String[] args) {


	}
}
