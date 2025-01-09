package com.basics;

public class Operators 
{
	/*
		1. Arithmetic Operators
		Used for basic mathematical operations:
	
		+ : Addition
		- : Subtraction
		* : Multiplication
		/ : Division
		% : Modulus (remainder)
		
		
		2. Relational (Comparison) Operators
		Used to compare values and return a boolean (true or false):
	
		== : Equal to
		!= : Not equal to
		> : Greater than
		< : Less than
		>= : Greater than or equal to
		<= : Less than or equal to
		
		
		3. Logical Operators
		Used to perform logical operations (mostly in conditional statements):
	
		&& : Logical AND (returns true if both operands are true)
		|| : Logical OR (returns true if at least one operand is true)
		! : Logical NOT (reverses the boolean value)
		
		4. Bitwise Operators
		Operate on binary data:
		& : Bitwise AND
		| : Bitwise OR
		^ : Bitwise XOR
		~ : Bitwise Complement
		<< : Left shift
		>> : Right shift
		>>> : Unsigned right shift
		
		
		5. Assignment Operators
		Used to assign values to variables:
	
		= : Assignment
		+= : Add and assign
		-= : Subtract and assign
		*= : Multiply and assign
		/= : Divide and assign
		%= : Modulus and assign
		
		
		6. Unary Operators
		Work with a single operand:
		+ : Unary plus (indicates a positive value)
		- : Unary minus (negates the value)
		++ : Increment (increases the value by 1; can be prefix or postfix)
		-- : Decrement (decreases the value by 1; can be prefix or postfix)
		! : Logical NOT
		
		7. Ternary Operator
		A shorthand for if-else:
		? : : Conditional operator
		Syntax: condition ? value_if_true : value_if_false
		
		
		8. Instanceof Operator
		Used to check whether an object is an instance of a specific class or subclass:
	
		instanceof
		9. Type Cast Operator
		Used to convert data types explicitly:
	
		(type)
		10. Special Operators
		new : Used to create new objects.
		. : Dot operator to access class members.
		[] : Array subscript to access elements.
	*/
	
	
	public static void main(String[] args) {
		
		int i = 5;
		System.out.println(i++);  // 5
		System.out.println(i--);  // 6
		System.out.println(i);// 5
		System.out.println(++i); //6
		System.out.println(--i);  //5
		System.out.println(++i + --i);// 11  

		
	}
}
