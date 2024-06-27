package constructer;

public class Car {
	String color;
	float prize;
	String model;
	int speed;
	

	public Car(String color, float prize, String model, int speed) {
		this.color = color;
		this.prize = prize;
		this.model = model;
		this.speed = speed;
	}
	
	void fast() {
		int speed_of_car = 100 * speed;
		System.out.println(speed_of_car);
	}
	
	void carFeatures() {
		System.out.println("Car Model is " + model + " Color of the car is " + color + " Prize of car is " + prize);
	}

}
