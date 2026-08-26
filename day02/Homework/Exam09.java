package Homework;

import java.util.Scanner;

public class Exam09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("전공 이수 학점 : ");
		int major = sc.nextInt();
		System.out.print("교양 이수 학점 : ");
		int general = sc.nextInt();
		System.out.print("일반 이수 학점 : ");
		int liberal = sc.nextInt();
		
		int total = major + general + liberal;
		
		System.out.println(
				(total >= 140 && major >= 70 && ((general >= 30 && liberal >= 30) || (general + liberal >= 80)))
				? "졸업 가능" : "졸업 불가능");
	}
}
