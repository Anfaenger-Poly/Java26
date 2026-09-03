package method;

import java.util.Scanner;

public class Programming03_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("철수 : ");
		String CS = sc.next();
		
		System.out.print("영희 : ");
		String YH = sc.next();
		
		if (CS.equals(YH)) {
			System.out.println("무승부!");
		}
		else if (CS.equals("r") && YH.equals("s")) {
			System.out.println("철수, 승!");			
		}
		else if (CS.equals("r") && YH.equals("p")) {
			System.out.println("철수, 패!");
		}
		else if (CS.equals("s") && YH.equals("p")) {
			System.out.println("철수, 승!");
		}
		else if (CS.equals("s") && YH.equals("r")) {
			System.out.println("철수, 패!");
		}
		else if (CS.equals("p") && YH.equals("r")) {
			System.out.println("철수, 승!");
		}
		else {
			System.out.println("철수, 패!");
		}
	}
}
