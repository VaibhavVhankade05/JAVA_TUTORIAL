package com.basics;

public class Static_NonStatic_Block 
{
	
	static {
		System.out.println("Static block");
	}
	
	
	{
		System.out.println("Non Static block");
	}
	
	
	static {
		System.out.println("Static block1");
	}
	
	
	{
		System.out.println("Non Static block1");
	}
	
	
	public static void main(String[] args) 
	{
		Static_NonStatic_Block block = new Static_NonStatic_Block();
		
		Static_NonStatic_Block block1 = new Static_NonStatic_Block(); 


	}

}
