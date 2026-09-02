package method;

import java.util.Scanner;

public class Challenge01 {
	public static void main(String[] args) {
		int result;
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		n = sc.nextInt();
		
		result = 1;
		
		while (true) {
			if (n <= 0) {
				break;
			}
			result *= n;
			n--;
		
		}
		
		
		System.out.println(result);
	}
}
