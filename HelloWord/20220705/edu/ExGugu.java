package edu;

import java.util.Scanner;

public class ExGugu {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("원하는 단을 입력해주세요 >>");
		int num = scn.nextInt();
		int gugu;
		System.out.println(" ");
		System.out.println("출력되는 단은 " + num + "단입니다.");

		System.out.println("======================");
		for (int i = 1; i <= 9; i++) {
			gugu = num * i;

			System.out.println(num + " * " + i + "= " + gugu);

		}

	}
}
