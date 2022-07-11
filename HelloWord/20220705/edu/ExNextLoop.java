package edu;

public class ExNextLoop {
	public static void main(String[] args) {

//		for (int j = 1; j < 10; j++) {
//			System.out.println();
//			System.out.println(j + "단");
//			for (int i = 1; i < 10; i++) {
//
//				System.out.printf("%d*%d = %d \n", j, i, i * j);
//			}
//
//		}
//	System.out.println("    *");
//	System.out.println("   *");
//	System.out.println("  *");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4-i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j <i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
