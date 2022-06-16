package com.ty.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBikeAndEngine {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("mySpring3.xml");
		Bike bike = (Bike) applicationContext.getBean("myBike");
		bike.engine.on();
	}

}
