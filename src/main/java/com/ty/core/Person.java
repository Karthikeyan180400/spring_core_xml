package com.ty.core;

public class Person {
	int id;
	String name;
	Pan pan;

	public Person(int id, String name, Pan pan) {
		this.id = id;
		this.name = name;
		this.pan = pan;
	}

	public void eat() {
		System.out.println(name + " is eating");
	}

	public void walk() {
		System.out.println(name + " is walking");
	}

}
