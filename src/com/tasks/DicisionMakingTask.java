package com.tasks;

import java.util.Scanner;

public class DicisionMakingTask
{
	static Scanner scanner = new Scanner(System.in);

	public void task1()
	{

		System.out.print("Enter three numbers: ");
		int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();

		if (a >= b && a >= c)
			System.out.println("Largest number: " + a);
		else if (b >= a && b >= c)
			System.out.println("Largest number: " + b);
		else
			System.out.println("Largest number: " + c);

	}


	public void task2()
	{
		System.out.print("Enter your marks: ");
		int marks = scanner.nextInt();

		if (marks >= 90) 
			{
			System.out.println("Grade: A");
			}
		else if (marks >= 75) {
			System.out.println("Grade: B");
		}
		else if (marks >= 60) {
			System.out.println("Grade: C");
		}
		else {
			System.out.println("Grade: Fail");
		}
	}


	public void task3()
	{
		System.out.print("Enter a year: ");
		int year = scanner.nextInt();

		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
			System.out.println(year + " is a Leap Year");
		else
			System.out.println(year + " is NOT a Leap Year");
	}


	public void task4()
	{
		System.out.print("Enter units consumed: ");
		int units = scanner.nextInt();
		double bill;

		if (units <= 100) {
			bill = units * 5;
		}
		else if (units <= 300) {
			bill = 100 * 5 + (units - 100) * 7;
		}
		else {
			bill = 100 * 5 + 200 * 7 + (units - 300) * 10;
		}

		System.out.println("Total Bill: ₹" + bill);
	}




	public void task5()
	{
		System.out.print("Enter two numbers: ");
		double num1 = scanner.nextDouble(), num2 = scanner.nextDouble();
		
		System.out.print("Enter operator (+, -, *, /): ");
		
		char op = scanner.next().charAt(0);

		switch (op) {
		case '+': System.out.println("Result: " + (num1 + num2)); 
		break;

		case '-': System.out.println("Result: " + (num1 - num2)); 
		break;

		case '*': System.out.println("Result: " + (num1 * num2)); 
		break;

		case '/': 
			if (num2 != 0) {
				System.out.println("Result: " + (num1 / num2)); 
			}
			else {
				System.out.println("Cannot divide by zero!");
			}
			break;

		default: System.out.println("Invalid operator!");

		}
	}

	public static void main(String[] args) 
	{
		DicisionMakingTask dmTask = new DicisionMakingTask();
		
		dmTask.task1();
		
		dmTask.task2();
		
		dmTask.task3();
		
		dmTask.task4();
		
		dmTask.task5();

	}
}
