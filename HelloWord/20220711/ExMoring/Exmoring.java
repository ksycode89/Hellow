package ExMoring;

import java.util.Scanner;

public class Exmoring {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String[] fruits = { "딸기, 바바나, 오렌지 , 자몽" };
		boolean isExit = false;
		System.out.println("입력");
		String fruit = scn.nextLine();
		for (int i = 0; i < fruits.length; i++) {
			if(fruits[i].equals(fruit)) {
			System.out.println((i + 1) + "번째 위치");
			isExit = true;
			break;
			}
			if(!isExit) {
				System.out.println("값이없습니다.");
		}
		}
		
		
	}
	
}
