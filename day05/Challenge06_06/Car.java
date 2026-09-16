package Challenge06_06;

public class Car extends Vehicle {
	private int displacement;
	private int gears;
	
	public Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}
	
	@Override
	void show() {
		super.show();
		System.out.println("배기량 : " + displacement + ", 기어 단수 : " + gears);
	}
}
