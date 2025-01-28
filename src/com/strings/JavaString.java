package com.strings;

public class JavaString 
{
	public JavaString()
	{
		
	}
	
	public JavaString(char[] ch)
	{
		System.out.println(ch);
	}
	
	/*
		String is basically an object that represents sequence of char values. 
		An array of characters works same as Java string. 
		For example:
			char[] ch ={'j','a','v','a','t','p','o','i','n','t'};  
			String s=new String(ch);
	
		Is same as:
			String s="javatpoint";  
	
		Java String class provides a lot of methods to perform operations on strings such as compare(), concat(), equals(), split(), length(), replace(), compareTo(), intern(), substring() etc.
		
		# What is String in Java?
			Generally, String is a sequence of characters. 
			But in Java, string is an object that represents a sequence of characters. 
			The "java.lang.String" class is used to create a string object.
			
			1) String Literal
				Java String literal is created by using double quotes. For Example:
					
					String s = "welcome";  
			
					String s1 = "Welcome";  
					String s2 = "Welcome";//It doesn't create a new instance 
					
			2) By new keyword
				String s = new String("Welcome");//creates two objects and one reference variable  
			
			# String
				The String class is one of the most fundamental types in Java, 
				designed to represent immutable sequences of characters. 
	
			Immutability: Once instantiated, a String object cannot be modified. 
			This immutable design is a deliberate choice to ensure thread safety, consistency, and efficiency, especially regarding the String pool mechanism.
		*/
	
	
//	charAt()
	public void chatAt()
	{
		String name = "javatpoint";  
		char ch = name.charAt(2); //returns the char value at the 4th index  
		System.out.println(ch + " for Vaibhav");  
		System.out.println(name.length());
	}
	
	
	
//	compare()
	public void compare()
	{
		String s1="hello";  
		String s2="hello";  
		String s3="meklo";  
		String s4="hemlo";  
		String s5="flag";  
		System.out.println(s1.compareTo(s2));//0 because both are equal  
		System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  
		System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"  
		System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f
	}
	
	
	
//	toUpperCase()
	public void upperCase()
	{
		String s1="JAVATPOINT HELLO, stRIng";  
		String s1lower = s1.toUpperCase(); 
		
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1lower);  
	}
	
	
	
	
//	toLowerCase()
	public void lowerCase()
	{
		String s1="JAVATPOINT HELLO stRIng";  
		String s1lower = s1.toLowerCase();  
		
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1lower);  
	}

//	equals()
	public void equals()
	{
		String s1 = "Vaibhav";
		String s2 = "Vaibhav";
		
		System.out.println(s1.equals(s2));
	}
	
	
	
	public void subString()
	{
		String s1="Javatpoint";    
        String substr = s1.substring(0); // Starts with 0 and goes to end  
        
        System.out.println(substr);  
        String substr2 = s1.substring(5,10); // Starts from 5 and goes to 10  
        
        System.out.println(substr2);    
        String substr3 = s1.substring(5,15); // Returns Exception  
	}
	
	public static void main(String[] args) {
		
		JavaString javaString = new JavaString();
//		javaString.chatAt();
//		
//		javaString.compare();
//		
//		javaString.upperCase();
//		
//		javaString.lowerCase();
		
		javaString.equals();
		
		javaString.subString();
//		char[] ch ={'j','a','v','a','t','p','o','i','n','t'}; 
//		JavaString s = new JavaString(ch);
//		String s = new String(ch);
//		System.out.println(s);
		
	}
}
