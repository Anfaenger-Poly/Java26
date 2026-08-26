package Homework;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.printf(a + "의 제곱은 %d\n", a*a);
	}
}
