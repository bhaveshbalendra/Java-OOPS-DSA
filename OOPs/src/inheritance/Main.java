package inheritance;

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.walk();
		p1.height = 10;
		p1.jump(10);
		System.out.println(p1.height);
	}
}
