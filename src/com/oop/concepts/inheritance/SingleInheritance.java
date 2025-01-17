package com.oop.concepts.inheritance;


public class SingleInheritance 
{
	
	
    public static void main(String[] args) 
    {
    	Animal animal = new Animal();
    	animal.Eat();
//    	animal.Brak();
    	

        Dog D = new Dog();
        D.Eat();
        D.Brak();
    }
  
    
}



class Animal
{
    void Eat()
    {
        System.out.println("All Animal Eat Food");
    }
    
}



class Dog extends Animal
{
    void Brak()
    {
        System.out.println("All Dogs Braking On Mitesh");
    }
}
