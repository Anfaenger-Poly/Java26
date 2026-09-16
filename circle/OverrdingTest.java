package circle;

public class OverrdingTest {
	public static void main(String[] args) {
		Circle c;
		System.out.println(">>> 원");
		printCircleInfo(new Circle(5.0));
		System.out.println();
		
		Ball b = new Ball(5.0);
		System.out.println(">>> 볼");
		printCircleInfo(b);
		System.out.println();
		
		Cylinder cy = new Cylinder(5.0, 7.0);
		System.out.println(">>> 원기둥");
		printCircleInfo(cy);
		Cylinder cy2 = (Cylinder)cy;
		System.out.println("높이 : " + cy2.getHeight());
	}
	
	public static void printCircleInfo(Circle c) {
		System.out.println("반지름 : " + c.getRadius());
		System.out.println("면적 : " + c.getArea());
	}
	
}
