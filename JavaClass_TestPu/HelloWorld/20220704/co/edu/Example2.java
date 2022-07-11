package co.edu;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		System.out.print("점수를 입력하세요 >>");
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		String grade;

		if (a >= 90) {
			if (a >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else if (a >= 80) {
			if (a >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		} else if (a >= 70) {
			if (a >= 75) {
				grade = "C+";
			} else {
				grade = "C";
			}
		} else {
			if (a >= 65) {
				grade = "D+";
			}
			{
				grade = "D";
			}
		}
		System.out.println("점수는" + a + "이고 등급은" + grade + "입니다.");

	}

}
