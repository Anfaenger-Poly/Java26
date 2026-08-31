package Grammar;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("직사각형의 가로 길이 : ");
		double a = sc.nextDouble();
		System.out.println("직사각형의 세로 길이 : ");
		double b = sc.nextDouble();
				
		System.out.printf("직사각형의 넓이는 %.1f cm 입니다.", a * b);
	}
}
