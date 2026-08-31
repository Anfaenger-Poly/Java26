package Grammar;

import java.util.Scanner;

public class For3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int num = 0;
		num = sc.nextInt();
		
		System.out.printf("[ 구구단 %d단 ]\n", num);
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n", num, i, num * i);
		}
	}
}
