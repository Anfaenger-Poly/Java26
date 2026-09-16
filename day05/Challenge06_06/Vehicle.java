package Challenge06_06;

public class Vehicle {
	protected String color;
	protected int speed;
	
	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	void show() {
		System.out.println("색상 : " + color + ", 속도 : " + speed);
	}
}
