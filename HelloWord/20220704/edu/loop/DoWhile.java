package edu.loop;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean isTrue = true;

//		while(isTrue){
//			System.out.println("입력 >>");
//			int inPut = scn.nextInt();
//			System.out.println("입력값은 " + inPut);
//			
//			if (inPut ==9) {
//				System.out.println("반복문 종료.");
//				isTrue = false;
//			}
//		}System.out.println("end of prog");
//		
		do {
			System.out.println("입력 >>");
			int inPut = scn.nextInt();
			System.out.println("입력값은 " + inPut);

			if (inPut == 9) {
				System.out.println("반복문 종료.");
				isTrue = false;
			}
		} while (isTrue);
		System.out.println("end of prog");
	}
}
