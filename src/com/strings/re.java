package com.strings;

public class re 
{
	public static void main(String[] args) {
		
		String name = "Vaibhav";
		String reverString = "";
		
		for(int i=0;i<name.length();i++)
		{
			reverString =  name.charAt(i) + "";
			
		}
			System.out.println(reverString);
		
	}
}
