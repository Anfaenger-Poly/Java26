package Grammar;

import java.util.Scanner;

public class While02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int num;
		int weiter;
		
		while (true) {
			System.out.println("숫자를 입력하세요 : ");
			num = sc.nextInt();
			
			System.out.println(num % 2 == 0 ? ">> 짝수입니다." : ">> 홀수입니다.");
			System.out.println("계속 하시겠습니다? (0-멈춤/1-계속)");
			
			weiter = sc.nextInt();
			if (weiter == 1) {
				continue;
			}
			else {
				break;
			}
			
		}
		
	}
}
