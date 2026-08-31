package Homework;

import java.util.Scanner;

public class Exam08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("0~999 사이의 숫자를 입력하세요 : ");
		int x = sc.nextInt();
		
		int hundred = x / 100;
		int ten = (x % 100) / 10;
		int one = x % 10;
		
		int sum = hundred + ten + one;
		
		System.out.printf("각 자릿수의 합 = " + sum);
	}
}
