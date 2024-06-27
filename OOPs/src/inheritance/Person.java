package inheritance;

public class Person {
	String name;
	int age;
	int height;
	float weight;
	
	void walk () {
		System.out.println("Yes the person can walk");
	}
	
	void jump(int height) {
		System.out.println("Person can jump to a height of " + height);
	}
}
