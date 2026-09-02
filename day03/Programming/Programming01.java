package method;

import java.util.Scanner;

public class Programming01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num >= 19) {
			System.out.println("성년");
		}
		else {
			System.out.println("미성년");
		}
	}
}
