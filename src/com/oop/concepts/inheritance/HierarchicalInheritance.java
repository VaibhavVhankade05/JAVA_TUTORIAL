package com.oop.concepts.inheritance;

public class HierarchicalInheritance 
{
    public static void main(String[] args) 
    {
        // Creating objects for each child class
        Car car = new Car();
        // Accessing methods
        car.start();
        car.drive();
        
        
        Bike bike = new Bike();
        bike.start();
        bike.ride();
        
        
        Truck truck = new Truck();
        truck.start();
        truck.loadCargo();
    }
}

// Parent Class
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Child Class 1 inheriting from Vehicle
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is being driven.");
    }
}

// Child Class 2 inheriting from Vehicle
class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is being ridden.");
    }
}

// Child Class 3 inheriting from Vehicle
class Truck extends Vehicle {
    void loadCargo() {
        System.out.println("Truck is loading cargo.");
    }
}
