package com.inheritance;

public class Main {

	public static void main(String[] args) {
		
		Person p1 = new Person("Harry", 10);
		Developer d = new Developer("lallu",30);
		d.hurry();
		d.walk();
	}
}

 class Person {
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void walk() {
		System.out.println("Person is walking");
		
	}
	void run() {
		System.out.println("Person is running");
	}
}

class Developer extends Person {
	public Developer(String name, int age) {
		super(name,age);
	}
	void hurry() {
		run();
	}
	void walk()  {
		System.out.println("Developer is ruuning");
	}
	
}
