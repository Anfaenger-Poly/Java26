package Grammar;

import java.util.Scanner;

public class For04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.println("양의 숫자를 입력하세요 : ");
		int num = 0;
		int sum = 0;
		
		while (true) {
			num = sc.nextInt();
			if (num > 0) {
				for (int i = 1; i <= num; i++) {
					sum += i;
				}
				break;
			}
			else {
				System.out.println("양의 숫자가 아닙니다. 다시 입력하세요 : ");
				continue;
			}
			
		}
		System.out.printf("1부터 %d까지의 합은 %d입니다.", num, sum);
	}
}
