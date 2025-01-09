package com.basics;

public class DataType 
{
	/*
		Data types 
			Data types specify the different sizes and values that can be stored in the variable.
		Types:
			1. Primitive Data Types: These are the basic types built into Java and hold simple values.
				1. boolean data type(size: 1bit)
				2. byte data type(size: 1byte)
				3. char data type(size: 2byte)
				4. short data type(size: 4byte)
				5. int data type(size: 4byte)
				6. long data type(size: 8byte)
				7. float data type(size: 4byte)
				8. double data type(size: 8byte)
	*/
	
		public static void dataType()
		{
			 // 1. byte (1 byte)
	        byte byteValue = 100;
	        System.out.println("byte value: " + byteValue);

	        // 2. short (2 bytes)
	        short shortValue = 32000;
	        System.out.println("short value: " + shortValue);

	        // 3. int (4 bytes)
	        int intValue = 123456;
	        System.out.println("int value: " + intValue);

	        // 4. long (8 bytes)
	        long longValue = 100000L;
	        System.out.println("long value: " + longValue);

	        // 5. float (4 bytes)
	        float floatValue = 3.14f;
	        System.out.println("float value: " + floatValue);

	        // 6. double (8 bytes)
	        double doubleValue = 3.14159;
	        System.out.println("double value: " + doubleValue);

	        // 7. char (2 bytes)
	        char charValue = 'A';
	        System.out.println("char value: " + charValue);

	        // 8. boolean (1 bit)
	        boolean booleanValue = true;
	        System.out.println("boolean value: " + booleanValue);
		}
	
	/*	
		2. Non-primitive data types: The non-primitive data types include Classes, Interfaces, and Arrays.
			1. Class
			2. Interface
			3. Array
			4. Enum
	*/
	public static void main(String[] args) 
	{
		dataType();
	}

}
