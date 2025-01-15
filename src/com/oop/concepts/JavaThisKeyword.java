package com.oop.concepts;

public class JavaThisKeyword 
{
	String name;
	int age;


	public JavaThisKeyword() {
		super();
		System.out.println("Vaibhav The Innocent Boy!");
	}


	public JavaThisKeyword(String name, int age) {
		//		1) this: to refer current class instance variable
		this.name = name;
		this.age = age;
	}
	
	
	
	public JavaThisKeyword(String name, int age, String city) {
		//		Real usage of this() constructor call
		this(name,age);
//		this.name = name;
//		this.age = age;
		this.age = age;
	}

	public void display()
	{
		System.out.println("Name:" + name + "\n" + "Age:" + age);
	}


	
	
	//	2) this: to invoke current class method
	void m()
	{
		System.out.println("Hello M Methods");
	}
	void n(){  
		System.out.println("Hello N Methos");   
		this.m();  
	}  
	void o()
	{
		this.n();
		System.out.println("Hello O Methos");
	}
	
	
	
//	4) this: to pass as an argument in the method
	void a(String message) {
        System.out.println("Hello M Methods: " + message);
    }
	
	void a()
	{
		System.out.println("a mehotd wiout para");
	}

    // Method b with a parameter
    void b(int number) {
        System.out.println("Hello N Methods, number: " + number);
        this.a("This is a parameterized call to method a"); 
        this.a();// Call to method a with a parameter
    }

    // Method c with a parameter
    void c(int x) {
        this.b(x * 2); // Call to method b with x * 2
        System.out.println("Hello O Methods, x = " + x);
    }
	
	public static void main(String[] args) {

		
//		Default Constructor
		JavaThisKeyword obj1 = new JavaThisKeyword();

//		Parameterized Constructor + "this": to refer current class instance variable
		JavaThisKeyword obj2 = new JavaThisKeyword("Shital",24);
//		2) this: to invoke current class method
		obj2.display();
		obj1.o(); // method chaining
		
		obj1.c(5);
	}


}
