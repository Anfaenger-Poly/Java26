package Homework;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원기둥의 밑면 반지름은?");
		double a = sc.nextDouble();
		System.out.println("원기둥의 높이는?");
		double b = sc.nextDouble();
		final double PI = 3.14;
		
		System.out.printf("원기둥의 부피는" + a * a * b * PI);
	}
}
