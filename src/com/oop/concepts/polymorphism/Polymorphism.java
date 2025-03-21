package com.oop.concepts.polymorphism;

public class Polymorphism 
{
	/*
		Polymorphism in Java is one of the fundamental concepts of object-oriented programming (OOP). 
		It allows objects to take many forms and perform tasks in different ways based on their types. 
		Polymorphism enhances flexibility and reusability in code.
		
		
		1. Compile-Time Polymorphism (Method Overloading)
			# Occurs during compilation.
			# Involves methods with the same name but different parameter lists (different types or numbers of parameters).
			# Achieved through method overloading.
			
			
			
		
		2. Runtime Polymorphism (Method Overriding)
			# Occurs during runtime.
			# Allows a subclass(child class) to provide a specific implementation of a method that is already defined in its superclass(Parent class).
			# Achieved through method overriding.
			
			
	
		Advantages of Polymorphism
		
			1. Code Reusability:
				Polymorphism allows methods in subclasses to override methods in their superclass, enabling code reuse and maintaining a consistent interface across related classes.
			
			2. Flexibility and Extensibility:
				Polymorphism allows subclasses to provide their own implementations of methods defined in the superclass, making it easier to extend and customize behavior without modifying existing code.
			
			3. Dynamic Method Invocation:
				Polymorphism enables dynamic method invocation, where the method called is determined by the actual object type at runtime, providing flexibility in method dispatch.
			
			4. Interface Implementation:
				Interfaces in Java allow multiple classes to implement the same interface with their own implementations, facilitating polymorphic behavior and enabling objects of different classes to be treated interchangeably based on a common interface.
			
			5. Method Overloading:
				Polymorphism is also achieved through method overloading, where multiple methods with the same name but different parameter lists can be defined within a class or its subclasses, enhancing code readability and allowing flexibility in method invocation based on parameter types.
			
			6. Reduced Code Complexity:
				Polymorphism helps reduce code complexity by promoting a modular and hierarchical class structure, making it easier to understand, maintain, and extend large-scale software systems.
		
	*/
	
	
	public static void main(String[] args) 
	{
		
		
		/* ------------------------ OVERLOADING ------------------------------- */
		Calculator calculator = new Calculator();
		
//		int c = calculator.add(5);
//		System.out.println(c);
		
		System.out.println(calculator.add(5));
		
		System.out.println(calculator.add(5, 5));
		
		System.out.println(calculator.add(5, 5, 5));
		
		
		/* ------------------------ OVERRIDING ------------------------------- */
		
		System.out.println("/* ------------------------ Cat ------------------------------- */");
		Cat cat = new Cat();
		cat.sound();
		cat.eat();
		
		
		System.out.println("/* ------------------------ Dog ------------------------------- */");
		Dog dog = new Dog();
		dog.sound();
		dog.bite();
		
		
		
		System.out.println("/* ------------------------ Animal ------------------------------- */");
		Animal animal = new Animal();
		animal.sound();
		animal.fear();
		
	}
}



/* ------------------------ OVERLOADING ------------------------------- */
class Calculator
{
	    // Method with one parameter
	    int add(int a) {
	        return a;
	    }

	    // Overloaded method with two parameters
	    int add(int a, int b) {
	        return a + b;
	    }

	    // Overloaded method with three parameters
	    int add(int a, int b, int c) {
	        return a + b + c;
	    }
}







/* ------------------------ OVERRIDING ------------------------------- */
class Animal {
    void sound() {
        System.out.println("This is a generic animal sound");
    }
    
    void fear()
    {
    	System.out.println("Animals Person ghabartat.....");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
    
    void bite()
    {
    	System.out.println("Dog Bites");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
    
    void eat()
    {
    	System.out.println("Drinking Milk");
    }
}

