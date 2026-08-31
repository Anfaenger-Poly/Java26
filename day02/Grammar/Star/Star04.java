package Grammar;

import java.util.Scanner;

public class Star04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = 0;
		num = sc.nextInt();
		
		for (int i = 0 ; i <= num; i++) {
			for (int j = 0 ; j < i ; j++) {
				System.out.print(" ");
			}
			for (int k = num; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
