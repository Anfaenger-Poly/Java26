package Homework;

import java.util.Scanner;

public class Challenge02 {
	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		x = sc.nextInt();
		
		System.out.println(x % 2 == 0 ? "짝수" : "홀수");
	}
}
