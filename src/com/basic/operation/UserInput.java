package com.basic.operation;

import java.util.Scanner;

public class UserInput 
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter a number");
		int a = scanner.nextInt();
		System.out.println("enter b number");
		int b = scanner.nextInt();
		
		int c = a+b;
		
		System.out.println("Sum of number" + c);
		
	}
}
