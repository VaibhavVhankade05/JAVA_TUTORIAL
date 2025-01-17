package com.oop.concepts.inheritance;

public class MultilevelInheritance 
{
	public static void main(String[] args) 
	{
		// Creating an instance of the Child class
		Child child = new Child();
		// Accessing methods from each class
		child.grandparentBehavior();
		child.parentBehavior();
		child.childBehavior();
		
		
		Parent parent = new Parent();
		parent.grandparentBehavior();
		parent.parentBehavior();
		
		
		Grandparent grandparent = new Grandparent();
		grandparent.grandparentBehavior();
		
	}
}







// Grandparent Class
class Grandparent 
{
	void grandparentBehavior() {
		System.out.println("Wisdom and Experience.");
	}
}



// Parent Class inheriting from Grandparent
class Parent extends Grandparent 
{
	void parentBehavior() {
		System.out.println("Care and Guidance.");
	}
}



// Child Class inheriting from Parent
class Child extends Parent 
{
	void childBehavior() {
		System.out.println("Play and learn new things.");
	}
}

