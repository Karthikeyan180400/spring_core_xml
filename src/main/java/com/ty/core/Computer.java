package com.ty.core;

public class Computer {
	private int id;
	private String name;
	private double cost;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void display() {
		System.out.println("Id is "+id);
		System.out.println("Name is "+name);
		System.out.println("Cost is "+cost);
	}
}
