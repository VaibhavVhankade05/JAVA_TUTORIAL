package com.control.statement;

public class ControllerStatement 
{
	/*
		Java provides statements that can be used to control the flow of Java code. Such statements are called control flow statements.

		$ Java provides three types of control flow statements.

			1. Decision Making statements
				# if-else statements
	 * Simple if statement
							if(condition) {    
								statement 1; //executes when condition is true   
							}   

	 * if-else statement
							if(condition) {    
								statement 1; //executes when condition is true   
							}  
							else{  
								statement 2; //executes when condition is false   
							}  

	 * if-else-if ladder
							if(condition 1) {    
								statement 1; //executes when condition 1 is true   
							}  
							else if(condition 2) {  
								statement 2; //executes when condition 2 is true   
							}  
							else {  
								statement 2; //executes when all the conditions are false   
							}  

	 * Nested if-statement
							if(condition 1) {    
								statement 1; //executes when condition 1 is true   
							if(condition 2) {  
								statement 2; //executes when condition 2 is true   
							}  
							else{  
								statement 2; //executes when condition 2 is false   
							}  
							}  

				# switch statement
					switch (expression){  
					    case value1:  
					     statement1;  
					     break;  
					    .  
					    .  
					    .  
					    case valueN:  
					     statementN;  
					     break;  
					    default:  
					     default statement;  
					}  

			2. Loop statements
			# do while loop
				do{    
				//code to be executed / loop body  
				//update statement   
				}while (condition); 

			# while loop
				while (condition){      
				//code to be executed     
				Increment / decrement statement    
				}   

			# for loop
				for(initialization; condition; increment/decrement){    
				//statement or code to be executed    
				}

	 */

//	Decision Making
	public void decisionMaking()
	{
		int number = 10;

		// Simple if
		if (number > 0) {
			System.out.println("The number is positive.");
		}

		// if-else
		if (number % 2 == 0) {
			System.out.println("The number is even.");
		} else {
			System.out.println("The number is odd.");
		}

		
		
		// if-else if-else
		if (number < 0) {
			System.out.println("The number is negative.");
		} else if (number == 0) {
			System.out.println("The number is zero.");
		} else {
			System.out.println("The number is positive.");
		}
	}

	
	
	
//	Switch Case
	public void switchCase()
	{
		int day = 3;

		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		default:
			System.out.println("Weekend");
			break;
		}
	}

	
//	Loops
	public void loop()
	{
		// For Loop
		for (int i = 1; i <= 5; i++) {
			System.out.println("Count: " + i);
		}

		
		// While Loop
		int i = 1;
		while (i <= 5) {
			System.out.println("Count: " + i);
			i++;
		}
		
		
		// Do While Loop
		do {
            System.out.println("Count: " + i);
            i++;
        } while (i <= 5);
	}


	public static void main(String[] args) {

		ControllerStatement controllerStatement = new ControllerStatement();
		
		controllerStatement.decisionMaking();
		
		controllerStatement.switchCase();
		
		controllerStatement.loop();
	}
}
