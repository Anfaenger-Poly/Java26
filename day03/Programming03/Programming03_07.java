package method;

import java.util.Scanner;

public class Programming03_07 {
	private static final String YS = null;
	static String CS;
	static String YH;
	public static void main(String[] args) {
		String c = input("철수");
		String y = input("영희");
		
		whosWin(c, y);
	}
	

	public static String input(String name) {
		Scanner sc = new Scanner(System.in);
		System.out.print(name + " : ");
		String CS = sc.next();
		return CS;
	
	}
		
	public static void whosWin(String CS, String YH) {
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
