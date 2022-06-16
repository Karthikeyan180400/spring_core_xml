package com.ty.core;

public class Employee {
	String name;
	String email;

	public Employee(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public void display() {
		System.out.println("Name is " + name);
		System.out.println("Email is " + email);
	}

}
