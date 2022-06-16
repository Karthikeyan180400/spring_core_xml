package com.ty.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPersonAndPan {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("mySpring3.xml");
		Person person = (Person) applicationContext.getBean("myPerson");

		person.pan.display();
		person.eat();
		person.walk();

	}

}
