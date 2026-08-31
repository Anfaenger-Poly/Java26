package Grammar;

import java.util.Scanner;

public class While01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (true) {
			System.out.println("숫자를 입력하세요 : ");
			int num = 0;
			num = sc.nextInt();
			if (num != 0) {
				sum += num;
			}
			else {
				break;
			}
		}
		System.out.printf("지금까지 입력한 숫자의 합은 %d입니다.", sum);
	}
}
