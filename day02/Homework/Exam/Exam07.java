package Homework;

import java.util.Scanner;

public class Exam07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int x = sc.nextInt();
		
		System.out.println(x % 4 == 0 && x % 5 == 0);
		System.out.println(x % 4 == 0 || x % 5 == 0);
		System.out.println((x % 4 == 0 || x % 5 == 0) && (x % 4 != 0 && x % 5 != 0));
	}
}
