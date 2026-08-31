package Homework;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("화씨온도를 입력하세요 : ");
		double F = sc.nextDouble();
		double C = (5.0 / 9.0) * (F - 32);
		
		System.out.printf("섭씨온도는 %.2f도입니다.", C);
	}
}
