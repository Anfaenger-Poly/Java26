package method;

public class Programming03_05 {
	public static void main(String[] args) {
		for (int a = 1; a <= 20; a++) {
			for (int b = a; b <= 20; b++) {
				for (int c = b; c <= 20; c++) {
					if (a + b + c > 20) {
						break;
					}
					if (a * a + b * b == c * c) {
						System.out.printf("삼각형의 각 변은 %d, %d, %d입니다.", a, b, c);
					}
				}
			}
		}
	}
}
