package co.edu.loop;

import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		boolean isTrue = true;
		int sum = 0;

		do {
			System.out.println("임의의 값을 입력하세요 >");
			int num = scn.nextInt();

			sum += num;
		System.out.println("sum의 값"+sum);
			if (sum>=100) {
				System.out.println("100이 넘기전 합산 : "+(sum-num));
			}
			if (sum >= 100) {
				System.out.println("100을 넘었습니다.");
				isTrue = false;
			}

		} while (isTrue);
		System.out.println("sum의 누적값 : " + sum);
		System.out.println("총 " + (sum - 100) + "만큼 오버하였습니다.");

		System.out.println("end of prog");

	}//100넘기전 값을 출력.
}
