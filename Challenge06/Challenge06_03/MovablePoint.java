package Challenge06_03;

public class MovablePoint extends Point {
	private int xSpeed;
	private int ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public int getXSpeed() {
		return xSpeed;
	}
	
	public int getYSpeed() {
		return ySpeed;
	}
	
	@Override
	public String toString() {
		return super.toString() + " 속도(" + xSpeed + "', " + ySpeed + ")";
	}
}
