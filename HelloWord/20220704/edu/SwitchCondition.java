package edu;

public class SwitchCondition {

	public static void main(String[] args) {
		int a = (int) (Math.random() * 6) + 1;

		if (a == 1) {
			System.out.println("if 1번출력");
		} else if (a == 2) {
			System.out.println("if 2번출력");
		} else if (a == 3) {
			System.out.println("if 3번출력");
		} else if (a == 4) {
			System.out.println("if 4번출력");
		} else if (a == 5) {
			System.out.println("if 5번출력");
		} else {
			System.out.println("if 6번출력");
		}
//	Switch
		switch(a) {
		case 1:
			System.out.println("1번출력"); break;
		case 2:
			System.out.println("2번출력"); break;
		case 3:
			System.out.println("3번출력"); break;
		case 4:
			System.out.println("4번출력"); break;	
		case 5:
			System.out.println("5번출력"); break;
		case 6:
			System.out.println("6번출력");
		}
		
		
		
		
		
	}
}