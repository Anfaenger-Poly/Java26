package method;

import java.util.Scanner;

public class Programming05_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 10개 입력하세요.");
		int num = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int g = 0;
		int h = 0;
		int j = 0;
		int k = 0;
		
		for (int i = 1; i <= 10; i++) {
			num = sc.nextInt();
			if (0 <= num && num < 10) {
				a++;
			}
			if (10 <= num && num < 20) {
				b++;
			}
			if (20 <= num && num < 30) {
				c++;
			}
			if (30 <= num && num < 40) {
				d++;
			}
			if (40 <= num && num < 50) {
				e++;
			}
			if (50 <= num && num < 60) {
				f++;
			}
			if (60 <= num && num < 70) {
				g++;
			}
			if (70 <= num && num < 80) {
				h++;
			}
			if (80 <= num && num < 90) {
				j++;
			}
			if (90 <= num && num < 100) {
				k++;
			}
		}
		System.out.print(" 0 ~  9 : ");
		for (int l = 0; a > l; l++) {
			System.out.print("*");
		}
		System.out.println("");
		
		System.out.print("10 ~ 19 : ");
		for (int l = 0; b > l; l++) {
			System.out.print("*");
		}
		System.out.println("");
		
		System.out.print("20 ~ 29 : ");
		for (int l = 0; c > l; l++) {
			System.out.print("*");
		}
		System.out.println("");
		
		System.out.print("30 ~ 39 : ");
		for (int l = 0; d > l; l++) {
			System.out.print("*");
		}
		System.out.println("");
		
		System.out.print("40 ~ 49 : ");
		for (int l = 0; e > l; l++) {
			System.out.print("*");
		}
		System.out.println("");
		
		System.out.print("50 ~ 59 : ");
		for (int l = 0; f > l; l++) {
			System.out.print("*");
		}
		System.out.println("");
		
		System.out.print("60 ~ 69 : ");
		for (int l = 0; g > l; l++) {
			System.out.print("*");
		}
		System.out.println("");
		
		System.out.print("70 ~ 79 : ");
		for (int l = 0; h > l; l++) {
			System.out.print("*");
		}
		System.out.println("");
		
		System.out.print("80 ~ 89 : ");
		for (int l = 0; j > l; l++) {
			System.out.print("*");
		}
		System.out.println("");
		
		System.out.print("90 ~ 99 : ");
		for (int l = 0; k > l; l++) {
			System.out.print("*");
		}
		System.out.println("");
	}	
}
