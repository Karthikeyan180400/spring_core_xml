package com.ty.core;

public class Pan {
	String number;
	String country;

	public Pan(String number, String country) {
		this.number = number;
		this.country = country;
	}

	public void display() {
		System.out.println("PAN Num is " + number);
		System.out.println("Country is " + country);
	}

}
