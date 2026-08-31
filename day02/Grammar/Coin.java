package Grammar;

import java.util.Scanner;

public class Coin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("금액 : ");
		int total = sc.nextInt();
		
		System.out.println("<동전의 수 >");
		int FIVE = (int)(total / 500);
		int ONE = (int)((total % 500) / (100));
		
		System.out.printf("500원짜리 = %d개\n", FIVE);
		System.out.printf("100원짜리 = %d개\n", ONE);
	}
}
