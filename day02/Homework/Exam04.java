package Homework;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("초 단위 정수를 입력하세요 : ");
		int a = sc.nextInt();
		
		int hour = a / 3600;
		int min = (a % 3600) / 60;
		int sec = a % 60;
		
		System.out.printf("%d시간 %d분 %d초", hour, min, sec);
	}
}
