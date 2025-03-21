package com.oop.concepts.abstraction;

public class Main 
{
	public static void main(String[] args) 
	{
		
		Implemention implementiion = new Implemention();
		
		implementiion.add();
		
		implementiion.sub(10, 5);
		
		implementiion.mult(2, 2);
		
		implementiion.div(10, 2);
		
		
		
		Calculator calculator = new Implemention();
		
		calculator.add();
		
		calculator.sub(80, 20);
	}
}
