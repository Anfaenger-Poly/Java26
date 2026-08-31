package Grammar;

import java.util.Scanner;

public class Star05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = 0;
		num = sc.nextInt();
		
		for (int i = 0; i <= num; i++) {
			for (int j = num; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < (i * 2) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
