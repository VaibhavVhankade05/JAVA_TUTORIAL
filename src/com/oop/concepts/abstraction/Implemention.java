package com.oop.concepts.abstraction;

public class Implemention extends Calculator
{

	@Override
	void add() {
		int a=1;
		int b=1;
		int c= a+b;
		System.out.println(c);
		
	}
	
	public int div(int a, int b)
	{
		return a+b;
	}

}
