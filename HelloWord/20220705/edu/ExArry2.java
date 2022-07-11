package edu;

public class ExArry2 {
	public static void main(String[] args) {
		int[] intAry = { 1, 24, 16, 29, 58, 99 };
		intAry[2] = 30;

		int a = intAry[0];
		intAry[0] = intAry[1];
		intAry[1] = a;

		int sum = 0;
		for (int i = 0; i < intAry.length; i++) {
//			if (i %2 ==0) {

			sum += intAry[i];
			System.out.println("내부출력: "+intAry[i]);
//			}
			
		}System.out.println("총합: "+sum);
	}
}
