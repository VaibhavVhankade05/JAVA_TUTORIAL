package com.oop.concepts.abstraction;

public class Abstraction 
{
	/*

		Hiding internal implementation and showing functionality.
				Eg. Calculator
		Can not create instance(object) of abstract class.
	  
		 # Points to Remember
			An abstract class must be declared with an abstract keyword.
			It can have abstract and non-abstract methods.
			It cannot be instantiated.
			It can have constructors and static methods also.
			It can have final methods which will force the subclass not to change the body of the method.	
	*/
	
	
	public static void main(String[] args) {
		
//		Activity activity = new Activity();
		
		Activity activity = new Game();
		
		activity.run();
		
		activity.start();
		
//		activity.swim();
		
		Game game = new Game();
		
		game.run();
		
		game.start();
		
		game.swim();
	}
	

}


abstract class Activity
{
	abstract void run();
	
	abstract void cycling();
	
	public void start()
	{
		System.out.println("-------------- Start Game --------------");
	}
}


class Game extends Activity
{

	@Override
	void run() {
		System.out.println("Shital Mam Run Faster Than Chitta....");
	}
	
	void swim()
	{
		System.out.println("I am Faster swimmer in world...?");
	}

	@Override
	void cycling() {
		System.out.println("Cycling");
		
	}
	
}
