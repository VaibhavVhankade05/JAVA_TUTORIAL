package com.oop.concepts.abstraction;

abstract class Calculator 
{
	
	abstract void add();
	
	public void sub(int a, int b)
	{
		System.out.println(a+b);
	}

	public int mult(int a, int b)
	{
		return a+b;
	}

	
}
