package com.ty.core;

public class Student {
	int id;
	String name;
	double percentage;

	public Student(int id, String name, double percentage) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	public void display() {
		System.out.println("Id is " + id);
		System.out.println("Name is " + name);
		System.out.println("Percentage is " + percentage);

	}

}
