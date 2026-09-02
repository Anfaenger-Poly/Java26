package method;

public class Gugudan02 {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			gugudan(i);
			System.out.println();
		}
	}
	public static void gugudan(int num) {
		// 입력된 num의 구구단을 출력
		System.out.printf("[ 구구단 %d단 ]\n", num);
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n", num, i, num * i);
		}
	}
	
}
