package com.oop.concepts;

import java.util.Scanner;

public class Encapsulation 
{
	/*
		Encapsulation in Java is a process of wrapping code and data together into a single unit
		We can create a fully encapsulated class in Java by making all the data members of the class private.
		
		# Advantage of Encapsulation in Java
			1. read-only or write-only
			2. control over the data
			3. achieve data hiding
			4. easy to test.
			5. standard IDE's are providing the facility to generate the getters and setters( easy and fast to create an encapsulated class )
		
	*/
	
	private Long roll_no;
	private String name;
	private String email;
	private String phoneNumber;
	private String dateOfBirth;
	private String department;
	private String city;
	private String state;
	private String gender;


	public Encapsulation() {

	}


	public Encapsulation(Long roll_no, String name, String email, String phoneNumber, String dateOfBirth, String department,
			String city, String state, String gender) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.department = department;
		this.city = city;
		this.state = state;
		this.gender = gender;
	}


	public Long getId() {
		return roll_no;
	}


	public void setId(Long id) {
		this.roll_no = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}

	
	
	public void setData()
	{
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Enter ID: ");
        setId(scanner.nextLong());
        scanner.nextLine();

        System.out.print("Enter Name: ");
        setName(scanner.nextLine());

        System.out.print("Enter Email: ");
        setEmail(scanner.nextLine());

        System.out.print("Enter Phone Number: ");
        setPhoneNumber(scanner.nextLine());

        System.out.print("Enter Date of Birth (yyyy-mm-dd): ");
        setDateOfBirth(scanner.nextLine());

        System.out.print("Enter Department: ");
        setDepartment(scanner.nextLine());

        System.out.print("Enter City: ");
        setCity(scanner.nextLine());

        System.out.print("Enter State: ");
        setState(scanner.nextLine());

        System.out.print("Enter Gender: ");
        setGender(scanner.nextLine());

        System.out.println("Data successfully set!");	
	}
	
	
	
	public void getData() {
        System.out.println("\n--- Student Information ---");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Date of Birth: " + getDateOfBirth());
        System.out.println("Department: " + getDepartment());
        System.out.println("City: " + getCity());
        System.out.println("State: " + getState());
        System.out.println("Gender: " + getGender());
    }
	
	

	public static void main(String[] args) 
	{
		Encapsulation student = new Encapsulation();
		
		student.setData();
		
		student.getData();
		
	}
}
