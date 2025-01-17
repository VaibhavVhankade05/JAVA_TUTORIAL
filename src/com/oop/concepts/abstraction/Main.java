package com.oop.concepts.abstraction;

public class Main 
{
	public static void main(String[] args) {
		
		Implementiion implementiion = new Implementiion();
		
		implementiion.add();
		
		implementiion.sub(10, 5);
		
		implementiion.mult(2, 2);
		
		implementiion.div(10, 2);
		
		
		
		Calculator calculator = new Implementiion();
		
		calculator.add();
		
		calculator.sub(80, 20);
	}
}
