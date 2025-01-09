package com.basics;

public class Introductuion
{
	// Introduction
    // 1. Java is a high-level, object-oriented programming language.
    // 2. Used for building applications across a variety of platforms, including desktop, mobile, web, and enterprise systems.

/* 
    Key Features of Java
        1. Platform Independence:
            Java programs are compiled into bytecode by the Java compiler, which is platform-independent and runs on the Java Virtual Machine (JVM).
            Convert Source => Bytecode
        
        2. Object-Oriented:
            Java is oop language.
            Java supports principles like inheritance, polymorphism, encapsulation, and abstraction, making it modular and reusable.
        
        3. Simple:
            Java has a simple syntax inspired by C++ but removes complex features like pointers and operator overloading.
        
        4. Secure:
            Features like the Security Manager and absence of explicit pointers make Java applications less vulnerable to security threats.
        
        5. Robust:
            Java provides strong memory management, exception handling, and garbage collection, reducing runtime errors.
        
        6. Multithreaded:
            Java allows developers to write programs that can perform many tasks simultaneously.
        
        7. High Performance:
            While interpreted, Java uses Just-In-Time (JIT) compilation to boost performance.
*/


/*
    1. JVM(JAVA VIRTUAL MACHINE)
        JVM is a virtual machine that runs java bytecode.
        JVM doesn't exist physically.
        JVM provides a runtime environment for java programs.

        # The JVM performs the following main tasks:
            Loads code
            Verifies code
            Executes code
            Provides runtime environment

    2. JRE(JAVA RUNTIME ENVIROMERNT)
        JRE is a package that contains JVM and libraries.
        JRE is used to run java programs.
        JRE contains set of tools which are used for developing Java applications.
        JRE physically exists
        JRE contains a set of libraries + other files that JVM uses at runtime.

    3. JDK(Java Development Kit)
        JDK is a package that contains JRE + development tools.
        JDK is used for developing Java applications.
        JDK physically exists
 */
	
	
	//	"main" method in Java is the entry point of any Java application
	public static void main(String[] args) 
	{
		System.out.println("Hello, Java!");
	}
	
	//	Naming Conventions in Java
		/*
			1. Classes and Interfaces
				# Use Pascal Case.
					public class CustomerDetails { }
					public interface PaymentProcessor { }
					
		
			2. Methods
				# Use camelCase.
					public void calculateTotal() { }
					public boolean isValid() { }
					
			
			3. Variables
				# Use camelCase.
					int customerAge;
					String customerName;
		*/

}
