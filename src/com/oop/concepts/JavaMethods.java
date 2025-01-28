package com.oop.concepts;

import java.util.Scanner;

public class JavaMethods 
{
	/*
		Method in Java
		Method is a way to perform some task.
		Instructions that performs a specific task
		A method is a block of code or collection of statements or a set of code grouped together to perform a certain task or operation.
		It is used to achieve the reusability (write a method once and use it many times.) of code

	 * Public: The method is accessible by all classes when we use public specifier in our application.

	 * Private: When we use a private access specifier, the method is accessible only in the classes in which it is defined.

	 * Protected: When we use protected access specifier, the method is accessible within the same package or subclasses in a different package.

	 * Default: When we do not use any access specifier in the method declaration, Java uses default access specifier by default. It is visible only from the same package only.

		1. without_return_without_parameter 
		2. without_return_with_parameter
		3. with_return_without_parameter
		4. with_return_with_parameter
	 */

	// 1. without_return_without_parameter 	
	void add1()
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Value:");
		a = sc.nextInt();
		System.out.println("Enter second value:");
		b = sc.nextInt();
		
		c = a + b;
		
		System.out.println("Addition Of :" + c);

	}


	
	// 2. without_return_with_parameter
	void Add2(int a, int b)
	{
		System.out.println("Addition: "+ (a+b));
	}
	
	
	
	// 3. with_return_without_parameter
    int Add3()
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers:");
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = a+b;
       return c;
    }
    
    
    
  // 4. with_return_with_parameter
    int Add4(int a,int b)
    {
        return a+b;
    }
    
    public static void main(String[] args) {
		
    	JavaMethods javaMethods = new JavaMethods();
    	
    	javaMethods.add1();
    	
    	javaMethods.Add2(10, 20);
    	
    	int d = javaMethods.Add3();
    	System.out.println(d);
    	
    	int c = javaMethods.Add4(10, 20);
    	System.out.println(c);
	}
}
