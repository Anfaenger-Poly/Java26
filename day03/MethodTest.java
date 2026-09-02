package method;

import java.util.Arrays;
import java.util.Scanner;

public class MethodTest {
	public static void main(String[] args) {
		int[] numArr = {3, 6, 2, 4, 8};
		System.out.println("getSum의 결과값 = " + getSum(numArr));
		System.out.println("getMax의 결과값 = " + getMax(numArr));
		System.out.println("getCount의 결과값 = " + getCount(numArr, 0));
		

		swapArray(numArr);
		System.out.println("swapArray의 결과값 = " + Arrays.toString(numArr));
		
	}
	
	public static int getSum(int[] numArr) {
		int sum = 0;
		
		for (int i = 0; i < numArr.length; i++) {
			sum += numArr[i];
		}
		
		return sum;
	}
	
	public static int getMax(int[] numArr) {
		int max = numArr[0];
		
		for (int i = 1; i < numArr.length; i++) {
			if (numArr[i] > max) {
				max = numArr[i];
			}
		}
		
		return max;
	}
	
	public static int getCount(int[] numArr, int target) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("목표 정수를 입력하세요 : ");
		int num = sc.nextInt();
		target = num;
		
		for (int i = 0; i < numArr.length; i++) {
			if (numArr[i] > target) {
				count++;
			}
		}
		
		return count;
	}
	
	public static void swapArray(int[] numArray) {
		int[] temp = new int[numArray.length];
		for (int i = 0; i < numArray.length; i++) {
			temp[i] = numArray[numArray.length -1 -i];
		}
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = temp[i];
		}
	}

	
}