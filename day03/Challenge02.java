package method;

import java.util.Scanner;

public class Challenge02 {
	public static void main(String[] args) {
		int result;
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		n = sc.nextInt();
		
		result = factorial(n);
		System.out.println(result);
	}
	
	static int factorial(int x) {
		int r = 1;
		
		while (x > 0) {
			r *= x;
			x--;
		}
		
		return r;
	}
}
