package edu;

public class ExArry3 {
	public static void main(String[] args) {
		int[] intAry = { 23, 34, 56, 67 }; // 배열은 추가 불가
		intAry = new int[] { 3, 6, 54, 79, 244 }; // 이전 배열은 사라짐

		System.out.println("3번출력" + intAry[3]);
		int sum = 0;

		for (int i = 0; i < intAry.length; i++) {

			sum += intAry[i];

			System.out.println("내부출력 :"+i+"번째 - "+intAry[i]);
		}
		double avg = (double)sum / intAry.length;
		System.out.println("합산: "+sum);
		System.out.println("평군: "+avg);

	}
}
