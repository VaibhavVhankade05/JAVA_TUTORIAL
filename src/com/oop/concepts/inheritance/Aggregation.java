package com.oop.concepts.inheritance;

public class Aggregation 
{
	/*
		1. "Has-A" Relationship:
			One class has a reference to another class.
			Example: A car has a engine.
		
		2. Ownership:
			The owning object does not control the lifecycle of the contained object.
			For example, a Department can exist independently of its Employees.
		
		3. Independent Objects:
			The contained object can exist even if the container object is destroyed.
		
	*/
	
	public static void main(String[] args) {
        // Creating an Engine object
        Engine engine = new Engine("V8");

        // Creating a Car object with Engine
        Cars car = new Cars("Ford Mustang", engine);

        // Displaying details
        car.displayDetails();
    }

}




class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}





class Cars {
    private String brand;
    private Engine engine; // Aggregation: Car has an Engine

    public Cars(String brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
    }

    public void displayDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Engine Type: " + engine.getType());
    }
}