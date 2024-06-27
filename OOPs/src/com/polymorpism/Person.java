package com.polymorpism;

public class Person {
	int age;
	String name;
	static int DOB;
	
	
	public Person(int age, String name, int DOB) {
		super();
		this.age = age;
		this.name = name;
		this.DOB = DOB;
	}
	
	void walk(String name) {
		System.out.println("The " + name + " walking");
	}
	void walk(int age) {
		System.out.println("The " + age + " is old");
	}
	public final static void height(Person p) {
		System.out.println("Hello world");
		System.out.println(p.age); // show error so we use static as referece 
		System.out.println(DOB);
	}
}
