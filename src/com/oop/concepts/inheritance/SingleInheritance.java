package com.oop.concepts.inheritance;


public class SingleInheritance 
{
	
	
    public static void main(String[] args) 
    {
    	Animal animal = new Animal();
    	animal.eat();
//    	animal.Brak();
    	

        Dog D = new Dog();
        D.eat();
        D.Brak();
    }
  
    
}



class Animal
{
    void eat()
    {
        System.out.println("All Animals Eat Food");
    }
    
}



class Dog extends Animal
{
    void Brak()
    {
        System.out.println("All Dogs Brak");
    }
}
