package edu;

import java.util.Scanner;

public class ExForTest {
	public static void main(String[] args) {
		int[] intAry = { 34, 23, 56, 22, 99, 28 };
		int sum = 0;
		int sum2 = 0;
		int sum3 = 0;

		for (int num : intAry) {
			sum += num;

		}
		sumAr(intAry);

//		System.out.println("총합은 " + sum + "이고" + "평균은" + sum / intAry.length + "이다");

		int[] intAry2 = new int[6];

		for (int i = 0; i < intAry2.length; i++) {
			intAry2[i] = (int) (Math.random() * 100) + 1;

			sum2 += intAry[i];
//		System.out.println(intAry[i]);
		}
		sumAr(intAry2);
//				System.out.println("합은 " + sum2 + "이고" + "평균은 " + sum2 / intAry.length + "이다");

		int[] scanAry = new int[5];
		Scanner scn = new Scanner(System.in);
		double avg = 0;

		for (int i = 0; i < scanAry.length; i++) {
			System.out.print("임의의 수를 입력하세요. -> " + (5 - i) + "번 남았습니다.");

			scanAry[i] = scn.nextInt();

			sum3 += scanAry[i];
			avg = (double) sum3 / scanAry.length;
//			System.out.println(avg);

		}
		sumAr(scanAry);

	}

	public static void sumAr(int[] arr) {
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			avg = (double) sum / arr.length;
		}
		System.out.printf("합산은 %d이고 평균은 %.2f 이다.\n", sum, avg);

	}
}
